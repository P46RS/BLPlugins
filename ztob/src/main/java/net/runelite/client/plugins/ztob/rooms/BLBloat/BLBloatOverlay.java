package net.runelite.client.plugins.ztob.rooms.BLBloat;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.inject.Inject;

import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.ztob.BLRoomOverlay;
import net.runelite.client.plugins.ztob.BLTheatreConfig;

public class BLBloatOverlay extends BLRoomOverlay
{
	@Inject
	private BLBloat bloat;

	@Inject
	protected BLBloatOverlay(BLTheatreConfig config)
	{
		super(config);
	}

	public Dimension render(Graphics2D graphics)
	{
		if (config.bloatIndicator() && bloat.isBloatActive())
        {
            renderPoly(graphics, bloat.getBloatStateColor(), bloat.getBloatTilePoly(), 2);
        }

		if (bloat.isBloatActive() && config.bloatHands() != BLTheatreConfig.BloatHandsSetting.DISABLED)
		{
			for (WorldPoint point : bloat.getBloathands().keySet())
			{
				if (config.bloatHands() == BLTheatreConfig.BloatHandsSetting.NORMAL)
				{
					drawTile(graphics, point, Color.CYAN, 1, 255, 10);
				}
				else
				{
					drawTile(graphics, point, bloat.getHandColor(), 1, 255, 10);
				}
			}
		}

		if (bloat.isBloatActive() && config.bloatUpTimer())
		{
			if (bloat != null)
			{
				Point canvasPoint = bloat.getBloatNPC().getCanvasTextLocation(graphics, String.valueOf(bloat.getBloatUpTimer()), 60);
				if (bloat.getBloatState() != 1)
				{
					renderTextLocation(graphics, String.valueOf(33 - bloat.getBloatDownCount()), Color.WHITE, canvasPoint);
				}
				else
				{
					renderTextLocation(graphics, String.valueOf(bloat.getBloatUpTimer()), Color.WHITE, canvasPoint);
				}
			}
		}

        return null;
	}
}
