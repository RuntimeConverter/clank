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

package org.clang.staticanalyzer.checkers.impl;

import org.clank.support.*;
import org.clank.support.aliases.*;
import static org.clank.support.NativePointer.*;
import org.llvm.adt.*;
import org.clang.staticanalyzer.checkers.impl.*;
import org.clang.staticanalyzer.core.ento.*;

//<editor-fold defaultstate="collapsed" desc="(anonymous namespace)::Leak">
@Converted(kind = Converted.Kind.AUTO,
 source = "${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Checkers/RetainCountChecker.cpp", line = 1732,
 FQN="(anonymous namespace)::Leak", NM="_ZN12_GLOBAL__N_14LeakE",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.staticanalyzer/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Checkers/RetainCountChecker.cpp -nm=_ZN12_GLOBAL__N_14LeakE")
//</editor-fold>
public class Leak extends /*public*/ CFRefBug implements Destructors.ClassWithDestructor {
/*public:*/
  //<editor-fold defaultstate="collapsed" desc="(anonymous namespace)::Leak::Leak">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Checkers/RetainCountChecker.cpp", line = 1734,
   FQN="(anonymous namespace)::Leak::Leak", NM="_ZN12_GLOBAL__N_14LeakC1EPKN5clang4ento11CheckerBaseEN4llvm9StringRefE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.staticanalyzer/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Checkers/RetainCountChecker.cpp -nm=_ZN12_GLOBAL__N_14LeakC1EPKN5clang4ento11CheckerBaseEN4llvm9StringRefE")
  //</editor-fold>
  public Leak(/*const*/ CheckerBase /*P*/ checker, StringRef name) {
    // : CFRefBug(checker, name) 
    //START JInit
    super(checker, new StringRef(name));
    //END JInit
    // Leaks should not be reported if they are post-dominated by a sink.
    setSuppressOnSink(true);
  }

  
  //<editor-fold defaultstate="collapsed" desc="(anonymous namespace)::Leak::getDescription">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Checkers/RetainCountChecker.cpp", line = 1739,
   FQN="(anonymous namespace)::Leak::getDescription", NM="_ZNK12_GLOBAL__N_14Leak14getDescriptionEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.staticanalyzer/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Checkers/RetainCountChecker.cpp -nm=_ZNK12_GLOBAL__N_14Leak14getDescriptionEv")
  //</editor-fold>
  @Override public /*const*/char$ptr/*char P*/ getDescription() /*const*//* override*/ {
    return $EMPTY;
  }

  
  //<editor-fold defaultstate="collapsed" desc="(anonymous namespace)::Leak::isLeak">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Checkers/RetainCountChecker.cpp", line = 1741,
   FQN="(anonymous namespace)::Leak::isLeak", NM="_ZNK12_GLOBAL__N_14Leak6isLeakEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.staticanalyzer/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Checkers/RetainCountChecker.cpp -nm=_ZNK12_GLOBAL__N_14Leak6isLeakEv")
  //</editor-fold>
  @Override public boolean isLeak() /*const*//* override*/ {
    return true;
  }

  //<editor-fold defaultstate="collapsed" desc="(anonymous namespace)::Leak::~Leak">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Checkers/RetainCountChecker.cpp", line = 1732,
   FQN="(anonymous namespace)::Leak::~Leak", NM="_ZN12_GLOBAL__N_14LeakD0Ev",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.staticanalyzer/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Checkers/RetainCountChecker.cpp -nm=_ZN12_GLOBAL__N_14LeakD0Ev")
  //</editor-fold>
  @Override public /*inline*/ void $destroy() {
    super.$destroy();
  }

  
  @Override public String toString() {
    return "" + super.toString(); // NOI18N
  }
}
