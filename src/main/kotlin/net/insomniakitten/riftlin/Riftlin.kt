package net.insomniakitten.riftlin

import org.dimdev.riftloader.listener.Instantiator

class Riftlin : Instantiator {
    override fun <T : Any> newInstance(clazz: Class<T>) = clazz.kotlin.objectInstance

    companion object {
        const val ID = "riftlin"
    }
}
