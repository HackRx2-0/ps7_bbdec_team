/*
 * Copyright (C) 2021 Dev Sebastian
 * This file is part of WonderScan <https://github.com/devsebastian/WonderScan>.
 *
 * WonderScan is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * WonderScan is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with WonderScan.  If not, see <http://www.gnu.org/licenses/>.
 */

//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.photo;

import org.opencv.photo.Tonemap;

// C++: class TonemapMantiuk
//javadoc: TonemapMantiuk

public class TonemapMantiuk extends Tonemap {

    protected TonemapMantiuk(long addr) { super(addr); }

    // internal usage only
    public static TonemapMantiuk __fromPtr__(long addr) { return new TonemapMantiuk(addr); }

    //
    // C++:  float cv::TonemapMantiuk::getSaturation()
    //

    //javadoc: TonemapMantiuk::getSaturation()
    public  float getSaturation()
    {
        
        float retVal = getSaturation_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  float cv::TonemapMantiuk::getScale()
    //

    //javadoc: TonemapMantiuk::getScale()
    public  float getScale()
    {
        
        float retVal = getScale_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  void cv::TonemapMantiuk::setSaturation(float saturation)
    //

    //javadoc: TonemapMantiuk::setSaturation(saturation)
    public  void setSaturation(float saturation)
    {
        
        setSaturation_0(nativeObj, saturation);
        
        return;
    }


    //
    // C++:  void cv::TonemapMantiuk::setScale(float scale)
    //

    //javadoc: TonemapMantiuk::setScale(scale)
    public  void setScale(float scale)
    {
        
        setScale_0(nativeObj, scale);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  float cv::TonemapMantiuk::getSaturation()
    private static native float getSaturation_0(long nativeObj);

    // C++:  float cv::TonemapMantiuk::getScale()
    private static native float getScale_0(long nativeObj);

    // C++:  void cv::TonemapMantiuk::setSaturation(float saturation)
    private static native void setSaturation_0(long nativeObj, float saturation);

    // C++:  void cv::TonemapMantiuk::setScale(float scale)
    private static native void setScale_0(long nativeObj, float scale);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
