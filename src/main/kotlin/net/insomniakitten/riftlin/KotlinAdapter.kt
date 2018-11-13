package net.insomniakitten.riftlin

import net.insomniakitten.pylon.annotation.rift.Listener
import org.dimdev.riftloader.RiftLoader
import org.dimdev.riftloader.listener.Instantiator
import kotlin.jvm.internal.Reflection
import kotlin.reflect.KClass

/**
 * Kotlin adapter for Rift's [Instantiator] API
 * @see RiftLoader.newInstanceOfClass
 * @author InsomniaKitten
 */
@Listener(priority = Int.MIN_VALUE)
class KotlinAdapter : Instantiator {
    /**
     * Attempts to return the [KClass.objectInstance] for
     * the given generic [Class] receiver. If no object
     * instance is present, `null` will be returned
     * @see Reflection.getOrCreateKotlinClass
     */
    override fun <T : Any> newInstance(receiver: Class<T>): T? {
        return receiver.kotlin.objectInstance
    }
}
