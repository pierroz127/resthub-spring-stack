/**
 *  This file is part of Resthub.
 *
 *  Resthub is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *   Resthub is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Resthub.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.resthub.core.exception;

/**
 * This kind of exception is thrown when you try to insert a Resource that already exists
 * (identified by its path).
 * 
 * @author Bouiaw
 *
 */
public class ResourceAlreadyExistsException extends ResthubException {

    /**
     * uid used for serialization
     */
	private static final long serialVersionUID = -2756199047085957601L;

	/**
     * Default constructor
     */
	public ResourceAlreadyExistsException() {
		super();
	}
	
    /**
     * Create a new ResourceAlreadyExistsException from a message
     */
	public ResourceAlreadyExistsException(String message) {
		super(message); 
	}

}
