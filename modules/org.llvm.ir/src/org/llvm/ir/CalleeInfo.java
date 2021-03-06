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

package org.llvm.ir;

import org.clank.support.*;
import org.clank.support.JavaDifferentiators.*;
import static org.clank.support.Unsigned.*;


/// \brief Class to accumulate and hold information about a callee.
//<editor-fold defaultstate="collapsed" desc="llvm::CalleeInfo">
@Converted(kind = Converted.Kind.AUTO,
 source = "${LLVM_SRC}/llvm/include/llvm/IR/ModuleSummaryIndex.h", line = 32,
 FQN="llvm::CalleeInfo", NM="_ZN4llvm10CalleeInfoE",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/Bitcode/Writer/BitcodeWriter.cpp -nm=_ZN4llvm10CalleeInfoE")
//</editor-fold>
public class/*struct*/ CalleeInfo {
  /// The static number of callsites calling corresponding function.
  public /*uint*/int CallsiteCount;
  /// The cumulative profile count of calls to corresponding function
  /// (if using PGO, otherwise 0).
  public long/*uint64_t*/ ProfileCount;
  //<editor-fold defaultstate="collapsed" desc="llvm::CalleeInfo::CalleeInfo">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/IR/ModuleSummaryIndex.h", line = 38,
   FQN="llvm::CalleeInfo::CalleeInfo", NM="_ZN4llvm10CalleeInfoC1Ev",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/Bitcode/Writer/BitcodeWriter.cpp -nm=_ZN4llvm10CalleeInfoC1Ev")
  //</editor-fold>
  public CalleeInfo() {
    // : CallsiteCount(0), ProfileCount(0) 
    //START JInit
    this.CallsiteCount = 0;
    this.ProfileCount = $int2ulong(0);
    //END JInit
  }

  //<editor-fold defaultstate="collapsed" desc="llvm::CalleeInfo::CalleeInfo">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/IR/ModuleSummaryIndex.h", line = 39,
   FQN="llvm::CalleeInfo::CalleeInfo", NM="_ZN4llvm10CalleeInfoC1Ejy",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/Bitcode/Writer/BitcodeWriter.cpp -nm=_ZN4llvm10CalleeInfoC1Ejy")
  //</editor-fold>
  public CalleeInfo(/*uint*/int CallsiteCount, long/*uint64_t*/ ProfileCount) {
    // : CallsiteCount(CallsiteCount), ProfileCount(ProfileCount) 
    //START JInit
    this.CallsiteCount = CallsiteCount;
    this.ProfileCount = ProfileCount;
    //END JInit
  }

  //<editor-fold defaultstate="collapsed" desc="llvm::CalleeInfo::operator+=">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/IR/ModuleSummaryIndex.h", line = 41,
   FQN="llvm::CalleeInfo::operator+=", NM="_ZN4llvm10CalleeInfopLEy",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/Bitcode/Writer/BitcodeWriter.cpp -nm=_ZN4llvm10CalleeInfopLEy")
  //</editor-fold>
  public CalleeInfo /*&*/ $addassign(long/*uint64_t*/ RHSProfileCount) {
    CallsiteCount++;
    ProfileCount += RHSProfileCount;
    return /*Deref*/this;
  }

  //<editor-fold defaultstate="collapsed" desc="llvm::CalleeInfo::CalleeInfo">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/IR/ModuleSummaryIndex.h", line = 32,
   FQN="llvm::CalleeInfo::CalleeInfo", NM="_ZN4llvm10CalleeInfoC1ERKS0_",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/Bitcode/Writer/BitcodeWriter.cpp -nm=_ZN4llvm10CalleeInfoC1ERKS0_")
  //</editor-fold>
  public /*inline*/ CalleeInfo(final /*const*/ CalleeInfo /*&*/ $Prm0) {
    // : CallsiteCount(.CallsiteCount), ProfileCount(.ProfileCount) 
    //START JInit
    this.CallsiteCount = $Prm0.CallsiteCount;
    this.ProfileCount = $Prm0.ProfileCount;
    //END JInit
  }

  //<editor-fold defaultstate="collapsed" desc="llvm::CalleeInfo::CalleeInfo">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/IR/ModuleSummaryIndex.h", line = 32,
   FQN="llvm::CalleeInfo::CalleeInfo", NM="_ZN4llvm10CalleeInfoC1EOS0_",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/Bitcode/Writer/BitcodeWriter.cpp -nm=_ZN4llvm10CalleeInfoC1EOS0_")
  //</editor-fold>
  public /*inline*/ CalleeInfo(JD$Move _dparam, final CalleeInfo /*&&*/$Prm0) {
    // : CallsiteCount(static_cast<CalleeInfo &&>().CallsiteCount), ProfileCount(static_cast<CalleeInfo &&>().ProfileCount) 
    //START JInit
    this.CallsiteCount = $Prm0.CallsiteCount;
    this.ProfileCount = $Prm0.ProfileCount;
    //END JInit
  }

  //<editor-fold defaultstate="collapsed" desc="llvm::CalleeInfo::operator=">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/include/llvm/IR/ModuleSummaryIndex.h", line = 32,
   FQN="llvm::CalleeInfo::operator=", NM="_ZN4llvm10CalleeInfoaSEOS0_",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.ir/llvmToClangType ${LLVM_SRC}/llvm/lib/Bitcode/Writer/BitcodeWriter.cpp -nm=_ZN4llvm10CalleeInfoaSEOS0_")
  //</editor-fold>
  public /*inline*/ CalleeInfo /*&*/ $assignMove(final CalleeInfo /*&&*/$Prm0) {
    this.CallsiteCount = $Prm0.CallsiteCount;
    this.ProfileCount = $Prm0.ProfileCount;
    return /*Deref*/this;
  }

  
  @Override public String toString() {
    return "" + "CallsiteCount=" + CallsiteCount // NOI18N
              + ", ProfileCount=" + ProfileCount; // NOI18N
  }
}
