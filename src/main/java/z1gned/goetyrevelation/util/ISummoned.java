package z1gned.goetyrevelation.util;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.level.ServerLevelAccessor;

import javax.annotation.Nullable;

public interface ISummoned {
    void moveTo(BlockPos pos, float yRot, float xRot);
    void setTrueOwner(@Nullable LivingEntity livingEntity);
    void setLimitedLife(int limitedLifeTicksIn);
    void setUpgraded(boolean upgraded);
    SpawnGroupData finalizeSpawn(ServerLevelAccessor pLevel, DifficultyInstance pDifficulty, MobSpawnType pReason, @Nullable SpawnGroupData pSpawnData, @Nullable CompoundTag pDataTag);
    void setTarget(@Nullable LivingEntity target);
    Entity getEntity();
}
