package com.lupicus.cc.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks
{
	public static final Block CLAIM_BLOCK = new ClaimBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5.0F).sound(SoundType.METAL)).setRegistryName("claim_block");

	public static void register(IForgeRegistry<Block> forgeRegistry	)
	{
		forgeRegistry.register(CLAIM_BLOCK);
	}
}
