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
package org.llvm.analysis.impl;

import org.clank.java.*;
import org.clank.support.*;
import org.clank.support.aliases.*;
import org.clank.support.JavaDifferentiators.*;
import static org.clank.java.built_in.*;
import static org.clank.support.Casts.*;
import static org.clank.java.io.*;
import static org.clank.java.std.*;
import static org.clank.java.std_pair.*;
import static org.llvm.adt.ADTAliases.*;
import static org.llvm.support.llvm.*;
import static org.clank.support.NativePointer.*;
import static org.clank.support.NativeType.*;
import static org.clank.support.Native.*;
import static org.clank.support.Unsigned.*;
import org.clank.support.NativeCallback.*;
import org.llvm.support.*;
import org.llvm.adt.*;
import org.llvm.adt.aliases.*;
import org.llvm.ir.*;
import org.llvm.pass.*;
import static org.llvm.ir.PassManagerGlobals.*;
import static org.llvm.analysis.java.AnalysisFunctionPointers.*;
import org.llvm.analysis.*;


//<editor-fold defaultstate="collapsed" desc="static type DomPrinterLlvmGlobals">
@Converted(kind = Converted.Kind.AUTO_NO_BODY,
 NM="org.llvm.analysis.impl.DomPrinterLlvmGlobals",
 cmd="jclank.sh -java-options=${SPUTNIK}/contrib/JConvert/llvmToClankType -print -empty-body -java-options=${SPUTNIK}/modules/org.llvm.analysis/llvmToClangType ${LLVM_SRC}/llvm/lib/Analysis/DomPrinter.cpp -nm=_ZN4llvm19createDomViewerPassEv;_ZN4llvm20createDomPrinterPassEv;_ZN4llvm23createDomOnlyViewerPassEv;_ZN4llvm23createPostDomViewerPassEv;_ZN4llvm24createDomOnlyPrinterPassEv;_ZN4llvm24createPostDomPrinterPassEv;_ZN4llvm27createPostDomOnlyViewerPassEv;_ZN4llvm28createPostDomOnlyPrinterPassEv; -static-type=DomPrinterLlvmGlobals -package=org.llvm.analysis.impl")
//</editor-fold>
public final class DomPrinterLlvmGlobals {


// Create methods available outside of this file, to use them
// "include/llvm/LinkAllPasses.h". Otherwise the pass would be deleted by
// the link time optimization.
//<editor-fold defaultstate="collapsed" desc="llvm::createDomPrinterPass">
@Converted(kind = Converted.Kind.AUTO_NO_BODY,
 source = "${LLVM_SRC}/llvm/lib/Analysis/DomPrinter.cpp", line = 252,
 FQN="llvm::createDomPrinterPass", NM="_ZN4llvm20createDomPrinterPassEv",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.analysis/llvmToClangType ${LLVM_SRC}/llvm/lib/Analysis/DomPrinter.cpp -nm=_ZN4llvm20createDomPrinterPassEv")
//</editor-fold>
public static FunctionPass /*P*/ createDomPrinterPass() {
  throw new UnsupportedOperationException("EmptyBody");
}

//<editor-fold defaultstate="collapsed" desc="llvm::createDomOnlyPrinterPass">
@Converted(kind = Converted.Kind.AUTO_NO_BODY,
 source = "${LLVM_SRC}/llvm/lib/Analysis/DomPrinter.cpp", line = 256,
 FQN="llvm::createDomOnlyPrinterPass", NM="_ZN4llvm24createDomOnlyPrinterPassEv",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.analysis/llvmToClangType ${LLVM_SRC}/llvm/lib/Analysis/DomPrinter.cpp -nm=_ZN4llvm24createDomOnlyPrinterPassEv")
//</editor-fold>
public static FunctionPass /*P*/ createDomOnlyPrinterPass() {
  throw new UnsupportedOperationException("EmptyBody");
}

//<editor-fold defaultstate="collapsed" desc="llvm::createDomViewerPass">
@Converted(kind = Converted.Kind.AUTO_NO_BODY,
 source = "${LLVM_SRC}/llvm/lib/Analysis/DomPrinter.cpp", line = 260,
 FQN="llvm::createDomViewerPass", NM="_ZN4llvm19createDomViewerPassEv",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.analysis/llvmToClangType ${LLVM_SRC}/llvm/lib/Analysis/DomPrinter.cpp -nm=_ZN4llvm19createDomViewerPassEv")
//</editor-fold>
public static FunctionPass /*P*/ createDomViewerPass() {
  throw new UnsupportedOperationException("EmptyBody");
}

//<editor-fold defaultstate="collapsed" desc="llvm::createDomOnlyViewerPass">
@Converted(kind = Converted.Kind.AUTO_NO_BODY,
 source = "${LLVM_SRC}/llvm/lib/Analysis/DomPrinter.cpp", line = 264,
 FQN="llvm::createDomOnlyViewerPass", NM="_ZN4llvm23createDomOnlyViewerPassEv",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.analysis/llvmToClangType ${LLVM_SRC}/llvm/lib/Analysis/DomPrinter.cpp -nm=_ZN4llvm23createDomOnlyViewerPassEv")
//</editor-fold>
public static FunctionPass /*P*/ createDomOnlyViewerPass() {
  throw new UnsupportedOperationException("EmptyBody");
}

//<editor-fold defaultstate="collapsed" desc="llvm::createPostDomPrinterPass">
@Converted(kind = Converted.Kind.AUTO_NO_BODY,
 source = "${LLVM_SRC}/llvm/lib/Analysis/DomPrinter.cpp", line = 268,
 FQN="llvm::createPostDomPrinterPass", NM="_ZN4llvm24createPostDomPrinterPassEv",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.analysis/llvmToClangType ${LLVM_SRC}/llvm/lib/Analysis/DomPrinter.cpp -nm=_ZN4llvm24createPostDomPrinterPassEv")
//</editor-fold>
public static FunctionPass /*P*/ createPostDomPrinterPass() {
  throw new UnsupportedOperationException("EmptyBody");
}

//<editor-fold defaultstate="collapsed" desc="llvm::createPostDomOnlyPrinterPass">
@Converted(kind = Converted.Kind.AUTO_NO_BODY,
 source = "${LLVM_SRC}/llvm/lib/Analysis/DomPrinter.cpp", line = 272,
 FQN="llvm::createPostDomOnlyPrinterPass", NM="_ZN4llvm28createPostDomOnlyPrinterPassEv",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.analysis/llvmToClangType ${LLVM_SRC}/llvm/lib/Analysis/DomPrinter.cpp -nm=_ZN4llvm28createPostDomOnlyPrinterPassEv")
//</editor-fold>
public static FunctionPass /*P*/ createPostDomOnlyPrinterPass() {
  throw new UnsupportedOperationException("EmptyBody");
}

//<editor-fold defaultstate="collapsed" desc="llvm::createPostDomViewerPass">
@Converted(kind = Converted.Kind.AUTO_NO_BODY,
 source = "${LLVM_SRC}/llvm/lib/Analysis/DomPrinter.cpp", line = 276,
 FQN="llvm::createPostDomViewerPass", NM="_ZN4llvm23createPostDomViewerPassEv",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.analysis/llvmToClangType ${LLVM_SRC}/llvm/lib/Analysis/DomPrinter.cpp -nm=_ZN4llvm23createPostDomViewerPassEv")
//</editor-fold>
public static FunctionPass /*P*/ createPostDomViewerPass() {
  throw new UnsupportedOperationException("EmptyBody");
}

//<editor-fold defaultstate="collapsed" desc="llvm::createPostDomOnlyViewerPass">
@Converted(kind = Converted.Kind.AUTO_NO_BODY,
 source = "${LLVM_SRC}/llvm/lib/Analysis/DomPrinter.cpp", line = 280,
 FQN="llvm::createPostDomOnlyViewerPass", NM="_ZN4llvm27createPostDomOnlyViewerPassEv",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.analysis/llvmToClangType ${LLVM_SRC}/llvm/lib/Analysis/DomPrinter.cpp -nm=_ZN4llvm27createPostDomOnlyViewerPassEv")
//</editor-fold>
public static FunctionPass /*P*/ createPostDomOnlyViewerPass() {
  throw new UnsupportedOperationException("EmptyBody");
}

} // END OF class DomPrinterLlvmGlobals
