/**
 * MIT License
 *
 * Copyright (c) [2020] [Sachi Nathanya Jayasooriya A.D.]
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.example.appproject;

/**
 * Helper class to QuotePage class
 * responsible for storing and
 * returning the image from the library when the user asks
 */
public class QuoteLibrary {
    //Class variable
    private int idxImage;

    /**
     * Constructor instance of QuoteLibrary
     * @param idxImage index of Image in array
     */
    public QuoteLibrary(int idxImage) {
        this.idxImage = idxImage;
    }

    //method to return image index
    public int getIdxImage() {
        return idxImage;
    }
}
