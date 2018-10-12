package com.parzivail.parzidyne.registry;

import com.parzivail.parzidyne.Resources;
import com.parzivail.util.block.*;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by colby on 12/26/2017.
 */
public class BlockRegister
{
	public static void register()
	{
	}

	private static void register(PBlock item)
	{
		GameRegistry.registerBlock(item, item.name);
	}

	private static void register(PBlockSand item)
	{
		GameRegistry.registerBlock(item, item.name);
	}

	private static void register(PBlockLayer item)
	{
		GameRegistry.registerBlock(item, item.name);
	}

	private static void register(PBlockPillar item)
	{
		GameRegistry.registerBlock(item, item.name);
	}

	private static void register(PBlockContainer item)
	{
		GameRegistry.registerBlock(item, item.name);
		GameRegistry.registerTileEntity(item.createNewTileEntity(null, 0).getClass(), Resources.tileDot(item.name));
	}
}