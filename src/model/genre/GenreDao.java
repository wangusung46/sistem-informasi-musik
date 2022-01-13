/*
 * Copyright (c) 2022 Bob.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bob - initial API and implementation and/or initial documentation
 */
package model.genre;

import java.util.List;

/**
 *
 * @author Bob
 */
public interface GenreDao {
    
    public abstract List<Genre> selectGenre();

    public abstract void addGenre(Genre genre);

    public abstract void updateGenre(Integer id, Genre genre);

    public abstract void deleteGenre(Integer id);

    public abstract Boolean selectGenreExist(String name);
}
