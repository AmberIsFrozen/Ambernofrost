package com.lx862.ambernofrost.mixin;

import net.minecraft.enchantment.FrostWalkerEnchantment;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(FrostWalkerEnchantment.class)
public class FrostWalkerEnchantmentMixin {
    @Inject(method = "freezeWater", at = @At("HEAD"), cancellable = true)
    private static void ambernofrost$cancelFrostWalker(LivingEntity entity, World world, BlockPos blockPos, int level, CallbackInfo ci){
        ci.cancel();
    }
}
