package com.wangwng34.zombiesnoburn.mixins;

import net.minecraft.block.BlockDirt;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraftforge.fml.common.FMLLog;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.entity.monster.EntityMob;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EntityZombie.class)
public abstract class MixinBlockDirt
{
    /**
     * @author WangWng34
     */

    @Inject(method = "shouldBurnInDay", at = @At("HEAD"), cancellable = true)
    private void protectMobsFromSun(CallbackInfoReturnable<Boolean> cir)
    {
        cir.setReturnValue(false);
    }
}
