package net.runelite.client.plugins.ztob;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import lombok.Getter;
import lombok.Setter;
import net.runelite.client.ui.overlay.Overlay;

public class BLNyloSelectionManager extends Overlay
{
	@Getter
	private BLNyloSelectionBox melee;

	@Getter
	private BLNyloSelectionBox mage;

	@Getter
	private BLNyloSelectionBox range;

	@Getter
	@Setter
	private boolean isHidden = true;

	@Getter
	private Rectangle meleeBounds = new Rectangle();

	@Getter
	private Rectangle rangeBounds = new Rectangle();

	@Getter
	private Rectangle mageBounds = new Rectangle();

	public BLNyloSelectionManager(BLNyloSelectionBox melee, BLNyloSelectionBox mage, BLNyloSelectionBox range)
	{
		this.mage = mage;
		this.melee = melee;
		this.range = range;
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (isHidden)
		{
			return null;
		}

		Dimension meleeD = melee.render(graphics);
		graphics.translate(meleeD.width + 1, 0);
		Dimension rangeD = range.render(graphics);
		graphics.translate(rangeD.width + 1, 0);
		Dimension mageD = mage.render(graphics);
		graphics.translate(- meleeD.width - rangeD.width - 2,0);

		meleeBounds = new Rectangle(getBounds().getLocation(), meleeD);
		rangeBounds = new Rectangle(new Point(getBounds().getLocation().x + meleeD.width + 1, getBounds().y), rangeD);
		mageBounds = new Rectangle(new Point(getBounds().getLocation().x + meleeD.width + 1 + rangeD.width + 1, getBounds().y), mageD);

		return new Dimension(meleeD.width + rangeD.width + mageD.width, Math.max(Math.max(meleeD.height, rangeD.height), mageD.height));
	}
}
