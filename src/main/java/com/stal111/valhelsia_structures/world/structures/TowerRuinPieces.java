package com.stal111.valhelsia_structures.world.structures;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.stal111.valhelsia_structures.ValhelsiaStructures;
import com.stal111.valhelsia_structures.init.ModStructurePieces;
import com.stal111.valhelsia_structures.world.template.Processors;
import com.stal111.valhelsia_structures.world.template.RedGlassSingleJigsawPiece;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.SharedSeedRandom;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.jigsaw.*;
import net.minecraft.world.gen.feature.structure.AbstractVillagePiece;
import net.minecraft.world.gen.feature.structure.StructurePiece;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.Collections;
import java.util.List;

public class TowerRuinPieces {

    public static void func_215139_a(ChunkGenerator<?> p_215139_0_, TemplateManager p_215139_1_, BlockPos p_215139_2_, List<StructurePiece> p_215139_3_, SharedSeedRandom p_215139_4_) {
        JigsawManager.field_214891_a.register(new JigsawPattern(new ResourceLocation(ValhelsiaStructures.MOD_ID, "tower_ruins"), new ResourceLocation("empty"), ImmutableList.of(Pair.of(new RedGlassSingleJigsawPiece(ValhelsiaStructures.MOD_ID + ":tower_ruin", Collections.singletonList(Processors.RED_GLASS_AND_STRUCTURE_BLOCK)), 1), Pair.of(new RedGlassSingleJigsawPiece(ValhelsiaStructures.MOD_ID + ":tower_ruin1", Collections.singletonList(Processors.RED_GLASS_AND_STRUCTURE_BLOCK)), 1), Pair.of(new RedGlassSingleJigsawPiece(ValhelsiaStructures.MOD_ID + ":tower_ruin2", Collections.singletonList(Processors.RED_GLASS_AND_STRUCTURE_BLOCK)), 1)), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawManager.func_214889_a(new ResourceLocation(ValhelsiaStructures.MOD_ID, "tower_ruins"), 7, Piece::new, p_215139_0_, p_215139_1_, p_215139_2_, p_215139_3_, p_215139_4_);
    }

    public static class Piece extends AbstractVillagePiece {

        public Piece(TemplateManager p_i50560_1_, JigsawPiece p_i50560_2_, BlockPos p_i50560_3_, int p_i50560_4_, Rotation p_i50560_5_, MutableBoundingBox p_i50560_6_) {
            super(ModStructurePieces.TOWER_RUIN, p_i50560_1_, p_i50560_2_, p_i50560_3_, p_i50560_4_, p_i50560_5_, p_i50560_6_);
        }

        public Piece(TemplateManager p_i50561_1_, CompoundNBT p_i50561_2_) {
            super(p_i50561_1_, p_i50561_2_, ModStructurePieces.TOWER_RUIN);
        }
    }
}