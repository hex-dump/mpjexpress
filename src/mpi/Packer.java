/*
 The MIT License

 Copyright (c) 2005 - 2007
   1. Distributed Systems Group, University of Portsmouth (2005)
   2. Community Grids Laboratory, Indiana University (2005)
   3. Aamir Shafi (2005 - 2007)
   4. Bryan Carpenter (2005 - 2007)
   5. Mark Baker (2005 - 2007)

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
 * File         : Packer.java
 * Author       : Aamir Shafi, Bryan Carpenter
 * Created      : Fri Sep 10 12:22:15 BST 2004
 * Revision     : $Revision: 1.7 $
 * Updated      : $Date: 2005/07/29 14:03:10 $
 */

package mpi;

public interface Packer {

  public abstract void pack(mpjbuf.Buffer mpjbuf, 
		            Object buf, 
		            int offset) throws MPIException ;

  public abstract void unpack(mpjbuf.Buffer mpjbuf,
                              Object buf, 
			      int offset) throws MPIException ;

  /**
   * Precondition for calling `unpackPartial()' is that `length'
   * is less than `size' (numEls).
   */
  public abstract void unpackPartial(mpjbuf.Buffer mpjbuf, 
		                     int length,
				     Object buf, int offset) 
	                                        throws MPIException ;

  // Pack and unpack items with repeat count.
  public abstract void pack(mpjbuf.Buffer mpjbuf, 
		            Object buf, 
			    int offset,
                            int count) throws MPIException;

  public abstract void unpack(mpjbuf.Buffer mpjbuf,
                              int length, 
			      Object buf, 
			      int offset, 
			      int count) throws MPIException;

  public abstract void unpack(mpjbuf.Buffer mpjbuf, 
		              Object buf, 
			      int offset,
                              int count) throws MPIException;

}

