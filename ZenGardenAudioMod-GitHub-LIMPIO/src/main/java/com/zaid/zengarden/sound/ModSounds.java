package com.zaid.zengarden.sound;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;

/** Registers the custom sound events supplied with the mod. */
public final class ModSounds {
    public static final String MOD_ID = "zengarden_audio";

    public static final SoundEvent ABRIR_LIBRO_O_MAPA = register("abrir_libro_o_mapa");
    public static final SoundEvent BOTON_MENUS = register("boton_menus");
    public static final SoundEvent CLACK_ATRAS = register("clack_atras");
    public static final SoundEvent CLAVADO = register("clavado");
    public static final SoundEvent CLICK_2 = register("click_2");
    public static final SoundEvent CLICK = register("click");
    public static final SoundEvent EXPLOSION = register("explosion");
    public static final SoundEvent LOGRO = register("logro");
    public static final SoundEvent MORDIDA_1 = register("mordida_1");
    public static final SoundEvent PASAR_POR_ENCIMA = register("pasar_por_encima");
    public static final SoundEvent PAUSA = register("pausa");
    public static final SoundEvent PLANTAR_PLANTAS_VARIANTE = register("plantar_plantas_variante");
    public static final SoundEvent PLANTAR_PLANTAS = register("plantar_plantas");
    public static final SoundEvent ROMPER_JARRON = register("romper_jarron");
    public static final SoundEvent SELECCIONAR_INVENTARIO = register("seleccionar_inventario");
    public static final SoundEvent SONIDO_AL_MORIR = register("sonido_al_morir");
    public static final SoundEvent SONIDO_ERROR = register("sonido_error");
    public static final SoundEvent SONIDO_ESPECIAL_PALA = register("sonido_especial_pala");

    private ModSounds() {}

    private static SoundEvent register(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(MOD_ID, name);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
    }

    public static void initialize() {
        // Calling this method forces this class to initialize and register every sound.
    }
}
