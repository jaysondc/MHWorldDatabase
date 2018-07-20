package com.gatheringhallstudios.mhworlddatabase.assets

import com.gatheringhallstudios.mhworlddatabase.R

private fun <T, K> createRegistry(vararg pairs: Pair<T, K>): (T) -> K? {
    val registry = mapOf(*pairs)
    return { registry[it] }
}

/**
 * Contains all mappings from icon name to a recolorable vector.
 * Do not create any additional registries, if anything, create mappings
 * from enums to entries in this registry.
 * This may or may not become automated
 */
val VectorRegistry = createRegistry(
        "Skill" to R.xml.ic_ui_armor_skill_base,

        "ArmorSet" to R.xml.ic_equipment_armor_set_base,
        "ArmorHead" to R.xml.ic_equipment_head_base,
        "ArmorChest" to R.xml.ic_equipment_chest_base,
        "ArmorArms" to R.xml.ic_equipment_arm_base,
        "ArmorWaist" to R.xml.ic_equipment_waist_base,
        "ArmorLegs" to R.xml.ic_equipment_leg_base,

        "Decoration1" to R.xml.ic_ui_decoration_1_base,
        "Decoration2" to R.xml.ic_ui_decoration_2_base,
        "Decoration3" to R.xml.ic_ui_decoration_3_base,

        "Ammo" to R.xml.ic_items_ammo_base,
        "Carapace" to R.xml.ic_items_carapace_base,
        "Meat" to R.xml.ic_items_meat_base,
        "Jaw" to R.xml.ic_items_monster_jaw_base,
        "Pellets" to R.xml.ic_items_pellets_base,
        "Slinger" to R.xml.ic_items_slinger_base,
        "Scale" to R.xml.ic_items_scale_base,
        "Claw" to R.xml.ic_items_claw_base,
        "Body" to R.xml.ic_items_body_base,
        "Hide" to R.xml.ic_items_hide_base,
        "Sac" to R.xml.ic_icons_sac_base

)

val SlotEmptyRegistry = fun(slot: Int) = when(slot) {
    1 -> R.drawable.ic_ui_slot_1_empty
    2 -> R.drawable.ic_ui_slot_2_empty
    3 -> R.drawable.ic_ui_slot_3_empty
    else -> R.drawable.ic_ui_slot_none
}

val ColorRegistry = createRegistry(
        "rare1" to R.color.icon_gray,
        "rare2" to R.color.icon_white,
        "rare3" to R.color.icon_lime,
        "rare4" to R.color.icon_green,
        "rare5" to R.color.icon_cyan,
        "rare6" to R.color.icon_blue,
        "rare7" to R.color.icon_violet,
        "rare8" to R.color.icon_orange,

        "White" to R.color.icon_white,
        "Gray" to R.color.icon_gray,
        "Pink" to R.color.icon_pink,
        "Red" to R.color.icon_red,
        "DarkRed" to R.color.icon_dark_red,
        "Orange" to R.color.icon_orange,
        "LightBeige" to R.color.icon_light_beige,
        "Beige" to R.color.icon_beige,
        "DarkBeige" to R.color.icon_dark_beige,
        "Gold" to R.color.icon_gold,
        "Yellow" to R.color.icon_yellow,
        "Violet" to R.color.icon_violet,
        "Blue" to R.color.icon_blue,
        "Cyan" to R.color.icon_cyan,
        "Green" to R.color.icon_green,
        "DarkGreen" to R.color.icon_dark_green,
        "DarkPurple" to R.color.icon_dark_purple
)