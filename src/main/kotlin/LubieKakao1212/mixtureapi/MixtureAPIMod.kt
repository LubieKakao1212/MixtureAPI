package LubieKakao1212.mixtureapi

import net.minecraftforge.fml.common.Mod
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

/**
 * Main mod class. Should be an `object` declaration annotated with `@Mod`.
 * The modid should be declared in this object and should match the modId entry
 * in mods.toml.
 *
 * An example for blocks is in the `blocks` package of this mod.
 */
@Mod(MixtureAPIMod.ID)
object MixtureAPIMod {
    const val ID = "mixtureapi"

    val LOGGER: Logger = LogManager.getLogger(ID)
}