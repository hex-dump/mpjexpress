/*
 The MIT License

 Copyright (c) 2005 - 2007
   1. Distributed Systems Group, University of Portsmouth (2005)
   2. Aamir Shafi (2005 - 2007)
   3. Bryan Carpenter (2005 - 2007)
   4. Mark Baker (2005 - 2007)

 Permission is hereby granted, free of charge, to any person obtaining
 a copy of this software and associated documentation files (the
 "Software"), to deal in the Software without restriction, including
 without limitation the rights to use, copy, modify, merge, publish,
 distribute, sublicense, and/or sell copies of the Software, and to
 permit persons to whom the Software is furnished to do so, subject to
 the following conditions:

 The above copyright notice and this permission notice shall be included
 in all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN
 NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR
 THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
/*
 * File         : MPJDevException.java
 * Author       : Aamir Shafi, Bryan Carpenter
 * Created      : Sat Oct 9 12:22:15 BST 2004
 * Revision     : $Revision: 1.3 $
 * Updated      : $Date: 2005/07/29 14:03:10 $
 *    
 */

package mpjdev;

import xdev.XDevException;

public class MPJDevException 
	       extends XDevException {

  public MPJDevException() {
   super();
  }
  
  public MPJDevException(Throwable cause) {
   super(cause);
  }

  public MPJDevException(String s) {
    super(s);
  }

}
