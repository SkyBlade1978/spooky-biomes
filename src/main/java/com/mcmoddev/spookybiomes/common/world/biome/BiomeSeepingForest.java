package com.mcmoddev.spookybiomes.common.world.biome;

import com.mcmoddev.proxyslib.world.biome.MistyBiome;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;

public class BiomeSeepingForest extends MistyBiome {

    public BiomeSeepingForest() {
        super(new Biome.BiomeProperties("Seeping Forest").setTemperature(0.25F).setRainfall(0.9F).setBaseHeight(0.05F).setHeightVariation(0.65F));
        setRegistryName("seeping_forest");
        spawnableCreatureList.clear();
        spawnableCreatureList.add(new Biome.SpawnListEntry(EntitySlime.class, 5, 1, 4));
        decorator.treesPerChunk = 3;
        decorator.grassPerChunk = 4;
        decorator.generateFalls = true;
        fogColor = 0x00ff8c;
        fogDensity = 0.500F;
    }

    @Override
    public int getSkyColorByTemp(float currentTemperature) {
        return 0x85E21F;
    }

    @Override
    public int getGrassColorAtPos(BlockPos pos) {
        return 0x85E21F;
    }

    @Override
    public int getFoliageColorAtPos(BlockPos pos) {
        return 0x85E21F;
    }

    @Override
    public int getWaterColorMultiplier() {
        return 0x85E21F;
    }

    @Override
    public float getSpawningChance() {
        return 0.2F;
    }
}
