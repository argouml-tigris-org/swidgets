// $Id$
// Copyright (c) 2003 The Regents of the University of California. All
// Rights Reserved. Permission to use, copy, modify, and distribute this
// software and its documentation without fee, and without a written
// agreement is hereby granted, provided that the above copyright notice
// and this paragraph appear in all copies.  This software program and
// documentation are copyrighted by The Regents of the University of
// California. The software program and documentation are supplied "AS
// IS", without any accompanying services from The Regents. The Regents
// does not warrant that the operation of the program will be
// uninterrupted or error-free. The end-user understands that the program
// was developed for research purposes and is advised not to rely
// exclusively on the program for any reason.  IN NO EVENT SHALL THE
// UNIVERSITY OF CALIFORNIA BE LIABLE TO ANY PARTY FOR DIRECT, INDIRECT,
// SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, INCLUDING LOST PROFITS,
// ARISING OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF
// THE UNIVERSITY OF CALIFORNIA HAS BEEN ADVISED OF THE POSSIBILITY OF
// SUCH DAMAGE. THE UNIVERSITY OF CALIFORNIA SPECIFICALLY DISCLAIMS ANY
// WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
// MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. THE SOFTWARE
// PROVIDED HEREUNDER IS ON AN "AS IS" BASIS, AND THE UNIVERSITY OF
// CALIFORNIA HAS NO OBLIGATIONS TO PROVIDE MAINTENANCE, SUPPORT,
// UPDATES, ENHANCEMENTS, OR MODIFICATIONS.

/*
 * DimensionUtility.java
 *
 * Created on 15 July 2002, 22:08
 */
package org.tigris.swidgets;

import java.awt.*;

/**
 * A collection of utility methods for Dimensions.
 *
 * @author Bob Tarling
 * @stereotype utility
 */
public class DimensionUtility {
    
    /** Create a new <code>Dimension</code> from an existing
     * <code>Dimension</code> with its width and height increased by
     * the width and height of another <code>Dimension</code>.
     *
     * @param original The <code>Dimension</code> to be added to.
     * @param add The <code>Dimension</code> whose length and breadth
     * are to be taken as the added values.
     * @return The resulting <code>Dimension</code>.
     */
    public static Dimension add(Dimension original, Dimension add) {
        return new Dimension((int) (original.getWidth() + add.getWidth()),
			     (int) (original.getHeight() + add.getHeight()));
    }

    /** Create a new <code>Dimension</code> from an existing
     * <code>Dimension</code> with its width and height increased by
     * the width and height of an <code>Insets</code> object.
     *
     * @param original The <code>Dimension</code> to be added to.
     * @param add The <code>Insets</code> object whose width and
     * height are to be taken as the added values.
     * @return The resulting <code>Dimension</code>.
     */
    public static Dimension add(Dimension original, Insets add) {
        return new Dimension((int) original.getWidth() + add.right + add.left,
			     (int) original.getHeight() + add.top + add.bottom);
    }
    
}