/**
 *  Singularity Mod for Minecraft.
 *  Copyright (C) 2015 Infinity Studio.
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *  @license GPLv3
*/
package org.infinitystudio.singularity.item;

import net.minecraft.item.Item;

/**
 * Singularity Item Base.
 * @author Lasm_Gratel
 */
public abstract class SingularityItem extends Item {

    private String name;

    /**
     * Instance a Singularity Item.
     * @param name The name of the item
     */
    public SingularityItem(String name) {
        this.name = name;
        this.setUnlocalizedName(name);
    }

    public String getName() {
        return name;
    }

}