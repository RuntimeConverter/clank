/**
 * This file was converted to Java from the original LLVM source file. The original
 * source file follows the LLVM Release License, outlined below.
 * 
 * ==============================================================================
 * LLVM Release License
 * ==============================================================================
 * University of Illinois/NCSA
 * Open Source License
 * 
 * Copyright (c) 2003-2017 University of Illinois at Urbana-Champaign.
 * All rights reserved.
 * 
 * Developed by:
 * 
 *     LLVM Team
 * 
 *     University of Illinois at Urbana-Champaign
 * 
 *     http://llvm.org
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal with
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 * 
 *     * Redistributions of source code must retain the above copyright notice,
 *       this list of conditions and the following disclaimers.
 * 
 *     * Redistributions in binary form must reproduce the above copyright notice
 *       this list of conditions and the following disclaimers in the
 *       documentation and/or other materials provided with the distribution.
 * 
 *     * Neither the names of the LLVM Team, University of Illinois at
 *       Urbana-Champaign, nor the names of its contributors may be used to
 *       endorse or promote products derived from this Software without specific
 *       prior written permission.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.  IN NO EVENT SHALL THE
 * CONTRIBUTORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS WITH THE
 * SOFTWARE.
 * 
 * ==============================================================================
 * Copyrights and Licenses for Third Party Software Distributed with LLVM:
 * ==============================================================================
 * The LLVM software contains code written by third parties.  Such software will
 * have its own individual LICENSE.TXT file in the directory in which it appears.
 * This file will describe the copyrights, license, and restrictions which apply
 * to that code.
 * 
 * The disclaimer of warranty in the University of Illinois Open Source License
 * applies to all code in the LLVM Distribution, and nothing in any of the
 * other licenses gives permission to use the names of the LLVM Team or the
 * University of Illinois to endorse or promote products derived from this
 * Software.
 * 
 * The following pieces of software have additional or alternate copyrights,
 * licenses, and/or restrictions:
 * 
 * Program             Directory
 * -------             ---------
 * Autoconf            llvm/autoconf
 *                     llvm/projects/ModuleMaker/autoconf
 * Google Test         llvm/utils/unittest/googletest
 * OpenBSD regex       llvm/lib/Support/{reg*, COPYRIGHT.regex}
 * pyyaml tests        llvm/test/YAMLParser/{*.data, LICENSE.TXT}
 * ARM contributions   llvm/lib/Target/ARM/LICENSE.TXT
 * md5 contributions   llvm/lib/Support/MD5.cpp llvm/include/llvm/Support/MD5.h
 */

package org.llvm.analysis;

import org.clank.support.*;
import static org.clank.support.Unsigned.*;
import org.llvm.adt.DenseMapInfo;
import org.llvm.adt.aliases.DenseMapInfo$LikePtr;
import org.llvm.adt.aliases.DenseMapInfoULong;
import org.llvm.ir.*;


// Specialize DenseMapInfo for MemoryLocation.
//<editor-fold defaultstate="collapsed" desc="llvm::DenseMapInfo<MemoryLocation>">
@Converted(kind = Converted.Kind.AUTO,
 source = "${LLVM_SRC}/llvm/include/llvm/Analysis/MemoryLocation.h", line = 124,
 FQN="llvm::DenseMapInfo<MemoryLocation>", NM="_ZN4llvm12DenseMapInfoINS_14MemoryLocationEEE",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.analysis/llvmToClangType ${LLVM_SRC}/llvm/lib/Analysis/MemoryLocation.cpp -nm=_ZN4llvm12DenseMapInfoINS_14MemoryLocationEEE")
//</editor-fold>
public class/*struct*/ DenseMapInfoMemoryLocation implements DenseMapInfo<MemoryLocation> {
  //<editor-fold defaultstate="collapsed" desc="llvm::DenseMapInfo<MemoryLocation>::getEmptyKey">
  @Converted(kind = Converted.Kind.MANUAL_SEMANTIC,
   source = "${LLVM_SRC}/llvm/include/llvm/Analysis/MemoryLocation.h", line = 125,
   FQN="llvm::DenseMapInfo<MemoryLocation>::getEmptyKey", NM="_ZN4llvm12DenseMapInfoINS_14MemoryLocationEE11getEmptyKeyEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.analysis/llvmToClangType ${LLVM_SRC}/llvm/lib/Analysis/MemoryLocation.cpp -nm=_ZN4llvm12DenseMapInfoINS_14MemoryLocationEE11getEmptyKeyEv")
  //</editor-fold>
  public /*inline*/ MemoryLocation getEmptyKey() {
    return new MemoryLocation((Value) DenseMapInfo$LikePtr.$Info().getEmptyKey(), $int2ulong(0));
  }

  //<editor-fold defaultstate="collapsed" desc="llvm::DenseMapInfo<MemoryLocation>::getTombstoneKey">
  @Converted(kind = Converted.Kind.MANUAL_SEMANTIC,
   source = "${LLVM_SRC}/llvm/include/llvm/Analysis/MemoryLocation.h", line = 128,
   FQN="llvm::DenseMapInfo<MemoryLocation>::getTombstoneKey", NM="_ZN4llvm12DenseMapInfoINS_14MemoryLocationEE15getTombstoneKeyEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.analysis/llvmToClangType ${LLVM_SRC}/llvm/lib/Analysis/MemoryLocation.cpp -nm=_ZN4llvm12DenseMapInfoINS_14MemoryLocationEE15getTombstoneKeyEv")
  //</editor-fold>
  public /*inline*/ MemoryLocation getTombstoneKey() {
    return new MemoryLocation((Value) DenseMapInfo$LikePtr.$Info().getTombstoneKey(), $int2ulong(0));
  }

  //<editor-fold defaultstate="collapsed" desc="llvm::DenseMapInfo<MemoryLocation>::getHashValue">
  @Converted(kind = Converted.Kind.MANUAL_SEMANTIC,
   source = "${LLVM_SRC}/llvm/include/llvm/Analysis/MemoryLocation.h", line = 131,
   FQN="llvm::DenseMapInfo<MemoryLocation>::getHashValue", NM="_ZN4llvm12DenseMapInfoINS_14MemoryLocationEE12getHashValueERKS1_",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.analysis/llvmToClangType ${LLVM_SRC}/llvm/lib/Analysis/MemoryLocation.cpp -nm=_ZN4llvm12DenseMapInfoINS_14MemoryLocationEE12getHashValueERKS1_")
  //</editor-fold>
  public /*uint*/int getHashValue(final /*const*/ MemoryLocation /*&*/ Val) {
    return DenseMapInfo$LikePtr.$Info().getHashValue(Val.Ptr)
       ^ DenseMapInfoULong.$Info().getHashValue(Val.Size)
       ^ DenseMapInfoAAMDNodes.$Info().getHashValue(Val.AATags);
  }

  //<editor-fold defaultstate="collapsed" desc="llvm::DenseMapInfo<MemoryLocation>::isEqual">
  @Converted(kind = Converted.Kind.MANUAL_SEMANTIC,
   source = "${LLVM_SRC}/llvm/include/llvm/Analysis/MemoryLocation.h", line = 136,
   FQN="llvm::DenseMapInfo<MemoryLocation>::isEqual", NM="_ZN4llvm12DenseMapInfoINS_14MemoryLocationEE7isEqualERKS1_S4_",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.analysis/llvmToClangType ${LLVM_SRC}/llvm/lib/Analysis/MemoryLocation.cpp -nm=_ZN4llvm12DenseMapInfoINS_14MemoryLocationEE7isEqualERKS1_S4_")
  //</editor-fold>
  public boolean isEqual(final /*const*/ MemoryLocation /*&*/ LHS, final /*const*/ MemoryLocation /*&*/ RHS) {
    return LHS.$eq(RHS);
  }

  //////////////////////////////////////////////////////////////
  // EXTRA MEMBERS: BEGIN

  @Override
  public boolean isKeyPointerLike() {
    return false;
  }
  
  private static final DenseMapInfoMemoryLocation $INFO = new DenseMapInfoMemoryLocation();
  
  public static DenseMapInfoMemoryLocation $Info() {
    return $INFO;
  }


  // EXTRA MEMBERS: END
  //////////////////////////////////////////////////////////////
  
  @Override public String toString() {
    return ""; // NOI18N
  }
}