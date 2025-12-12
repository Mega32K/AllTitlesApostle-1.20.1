package z1gned.goetyrevelation.util;

import com.Polarice3.Goety.common.entities.ally.Summoned;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.level.ServerLevelAccessor;
import org.jetbrains.annotations.Nullable;

public class SummonedAdapter implements ISummoned {
    Summoned summoned;
    public SummonedAdapter(Summoned summoned) {
        this.summoned = summoned;
    }

    @Override
    public void moveTo(BlockPos pos, float yRot, float xRot) {
        summoned.moveTo(pos, yRot, xRot);
    }

    @Override
    public void setTrueOwner(@Nullable LivingEntity livingEntity) {
        summoned.setTrueOwner(livingEntity);
    }

    @Override
    public void setLimitedLife(int limitedLifeTicksIn) {
        summoned.setLimitedLife(limitedLifeTicksIn);
    }

    @Override
    public void setUpgraded(boolean upgraded) {
        summoned.setUpgraded(upgraded);
    }

    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor pLevel, DifficultyInstance pDifficulty, MobSpawnType pReason, @Nullable SpawnGroupData pSpawnData, @Nullable CompoundTag pDataTag) {
        return summoned.finalizeSpawn(pLevel, pDifficulty, pReason, pSpawnData, pDataTag);
    }

    @Override
    public void setTarget(@Nullable LivingEntity target) {
        summoned.setTarget(target);
    }

    @Override
    public Entity getEntity() {
        return summoned;
    }
}
