/**
 *   This file is part of Skript.
 *
 *  Skript is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Skript is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Skript.  If not, see <http://www.gnu.org/licenses/>.
 *
 *
 * Copyright 2011-2017 Peter Güttinger and contributors
 */
package ch.njol.skript.expressions;

import org.bukkit.event.Event;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.eclipse.jdt.annotation.Nullable;

import ch.njol.skript.Skript;
import ch.njol.skript.doc.Description;
import ch.njol.skript.doc.Examples;
import ch.njol.skript.doc.Name;
import ch.njol.skript.doc.Since;
import ch.njol.skript.expressions.base.EventValueExpression;
import ch.njol.skript.lang.ExpressionType;

@Name("Teleport Cause")
@Description("The <a href='../classes/#teleportcause'>teleport cause</a> within a player teleport event.")
@Examples("teleport cause is nether portal, end portal or end gateway")
@Since("2.2-dev35")
public class ExprTeleportCause extends EventValueExpression<TeleportCause> {
	
	static {
		Skript.registerExpression(ExprTeleportCause.class, TeleportCause.class, ExpressionType.SIMPLE, "[the] teleport (cause|reason|type)");
	}
	
	public ExprTeleportCause() {
		super(TeleportCause.class);
	}
	
	@Override
	public String toString(final @Nullable Event event, final boolean debug) {
		return "the teleport cause";
	}
	
}
