package com.example.lab_8

// A wizard casts spells using mana.
class Wizard(val name: String, var mana: Int, var spellPower: Int) {

    fun castSpell(spell: String): Int {
        when (spell) {
            "Explosion" -> {
                if (mana >= 10) {
                    mana -= 10
                    return spellPower * 3
                } else return 0
            }

            "Frostbite" -> {
                if (mana >= 5) {
                    mana -= 5
                    return spellPower * 2
                } else return 0
            }

            else -> {
                return 0
            }
        }
    }

    fun restoreMana(amount: Int) {
        mana = minOf(100, mana + amount)
    }

    fun train() { }
}