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

package org.llvm.mc;

import org.clank.support.*;
import static org.clank.support.Unsigned.*;


/// MCRegisterDesc - This record contains information about a particular
/// register.  The SubRegs field is a zero terminated array of registers that
/// are sub-registers of the specific register, e.g. AL, AH are sub-registers
/// of AX. The SuperRegs field is a zero terminated array of registers that are
/// super-registers of the specific register, e.g. RAX, EAX, are
/// super-registers of AX.
///
//<editor-fold defaultstate="collapsed" desc="llvm::MCRegisterDesc">
@Converted(kind = Converted.Kind.AUTO,
 source = "${LLVM_SRC}/llvm/include/llvm/MC/MCRegisterInfo.h", line = 105,
 FQN="llvm::MCRegisterDesc", NM="_ZN4llvm14MCRegisterDescE",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.adtsupport/llvmToClangType ${LLVM_SRC}/llvm/lib/MC/MCRegisterInfo.cpp -nm=_ZN4llvm14MCRegisterDescE")
//</editor-fold>
public class/*struct*/ MCRegisterDesc {
  public /*uint32_t*/int Name; // Printable name for the reg (for debugging)
  public /*uint32_t*/int SubRegs; // Sub-register set, described above
  public /*uint32_t*/int SuperRegs; // Super-register set, described above
  
  // Offset into MCRI::SubRegIndices of a list of sub-register indices for each
  // sub-register in SubRegs.
  public /*uint32_t*/int SubRegIndices;
  
  // RegUnits - Points to the list of register units. The low 4 bits holds the
  // Scale, the high bits hold an offset into DiffLists. See MCRegUnitIterator.
  public /*uint32_t*/int RegUnits;
  
  /// Index into list with lane mask sequences. The sequence contains a lanemask
  /// for every register unit.
  public /*uint16_t*/char RegUnitLaneMasks;
  
  @Override public String toString() {
    return "" + "Name=" + Name // NOI18N
              + ", SubRegs=" + SubRegs // NOI18N
              + ", SuperRegs=" + SuperRegs // NOI18N
              + ", SubRegIndices=" + SubRegIndices // NOI18N
              + ", RegUnits=" + RegUnits // NOI18N
              + ", RegUnitLaneMasks=" + $ushort2uint(RegUnitLaneMasks); // NOI18N
  }
}