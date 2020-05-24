ImgCompare
==========
this class has methodes that compare 2 Buffered image


variable
--------
* private static boolean isDebugging

this is boolean variable that just can access debugging part.
when it is true, we can get 2 png image file that different part.

 * private static double hueNoise=0.1, satNoise=0.35, lumNoise=0.5

these variables are allow noise that different each images' pixel.

these variables are using isHSLDifferent to jedge different.

they are set 0.1, 0.35, 0.5 default, and setNoise method can change these values.

* 	protected static BufferedImage partA, partB;

these variables are using extract img.
//these variables need to be controled by semaphore!

method
-------
* public static int getPixelDif(BufferedImage a, BufferedImage b)

//return int variable that how much different pixel number.

this is method that get each BufferedImage pixel different number.

different judge is decided by "isHSLdifferent" method.

it has lagacy remark that compare to RGB value.(it don't use ANYMORE)


* protected static void extractDifferentPart() 

//need to be controled by semaphore!

this is method that export image files that different part.

file name is difPartA, and difPartB.


* protected static boolean isHSLdifferent(double[] aHSL, double[] bHSL)

//same: return false, different: return false. 

this is method that check each HSL array value is different.

because of noise, each pixel is very hard to perfectly same.

so each Hue, Saturation, Luminace value compare part is considered that how much allow same to small different.

if anypart is not allow, this method return true, else, return false.

Hue need to considered that how much different Saturation and Luminace too.

Saturation also considered that how much different Luminace too.

* protected static double[] getHSLfromRGB(int rgb)
* protected static double[] getHSLfromRGB(int[] rgbArray)

//return double array that has HSL value.

these are methodes that get HSL array to RGB value(OR RGB array)

all array double value just in 0<value, AND 1>value.

* protected static int[] RGBtoArray(int rgb)

//return int array that meaning rgbArray

this is method that get rgbArray from rgb value.

* protected static int getRGBdifSum(int arrayA[], int arrayB[])

//return int value that meaning each rgbArray's different part.

this is method that get different value of each rgbArray's red, green, and blue value.

this method use to compare each pixel value to rgb different.

* public static int setNoise(double h, double s, double l)

this is method that setting noise variables.



public class PDFCompare extends ImgCompare
==========================================
this class has methodes that compare 2 PDF captured image

variable
---------------
* private static int left=0, right=0
* private static int top=0, down=0

these variables are meaning that set no margin area.

default values are all 0, but when need to cut margin, these variables are set each values meaning no margin area.

* private static int allowDif=200

this variable is meaning that how much allow different pixel

default is 200.

* private static int pixelAmount=0

this variable is meaning that how much size of image.

default is 0, but when compare two images, each BufferedImage is converted same size.

and this variable is set width×height value.

* private static boolean isCutMargin[]= {false, true}

this variable is meaning that cut margin or not.


isCutMargin[0] is meaning top and down margin.

isCutMargin[1] is meaning left and right margin.

* private static boolean isMarginCheckAuto=true

this variable is meaning that set margin area automatically or not.

method
----------------
* public static boolean compare(BufferedImage origin, BufferedImage video)

//return different:true, same:false.

this method is meaning that each BufferedImage is same or not.

when it get different Pixel number to getPDFDifValue,

it calculate with pixelAmount and allowDif that it can set same judge or not.

* public static int getPDFDifValue(BufferedImage origin, BufferedImage video)

//return int value that calculate getPixelDif(originTransform, videoTransform),

this method is convert origin, and video BufferedImage to same size, and cut margin(if option setting allow that)

when check each parameters are not null value, then check margin and cut margin.

resizing each BufferedImage, and set pixelAmount and input each converted BufferedImage to getPixelDif method.

* private static BufferedImage marginCut(BufferedImage video)

//return BufferedImage thar cut margin

this method is convert 