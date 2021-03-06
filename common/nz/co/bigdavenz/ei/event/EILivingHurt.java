/**
 * 
 */
package nz.co.bigdavenz.ei.event;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import nz.co.bigdavenz.ei.core.handler.EIDebugHandler;
import nz.co.bigdavenz.ei.debug.DebugMessage;
import nz.co.bigdavenz.ei.debug.DebugType;
import nz.co.bigdavenz.ei.lib.XPModifiers;

/**
 * @author BigDaveNz
 * 
 */
public class EILivingHurt {

    /**
     * General Living Hurt Processor
     */
    public static void process(LivingHurtEvent event) {
        if (event.entityLiving instanceof EntityPlayerMP) {
            int amount = (int) event.ammount * 10;
            DamageSource damageSource = event.source;
            EntityPlayer player = (EntityPlayer) event.entityLiving;
            String username = player.getDisplayName();
            String damageType = damageSource.getDamageType();
            EIDebugHandler.sendDebugInfoToConsole(new DebugMessage("Player: " + username + " Was hurt by: " + damageType + ". Amount: " + amount, DebugType.TRACKING));

            switch (damageType) {

                case "fall":
                    int xpGain = amount * XPModifiers.XP_PER_DAMAGE_FALL;

            }
        }
    }
}
