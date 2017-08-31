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

package org.clang.staticanalyzer.core.ento.check;

import org.clank.support.*;
import static org.llvm.support.llvm.*;
import org.clang.ast.*;
import org.clang.staticanalyzer.core.bugreporter.ento.*;
import org.clang.staticanalyzer.core.ento.*;
import org.clang.staticanalyzer.core.pathsensitive.ento.*;
import org.clang.staticanalyzer.java.StaticAnalyzerCheckerManagerFunctions.*;
import org.clang.staticanalyzer.java.*;

/*template <typename DECL> TEMPLATE*/
//<editor-fold defaultstate="collapsed" desc="clang::ento::check::ASTDecl">
@Converted(kind = Converted.Kind.MANUAL_SEMANTIC,
 source = "${LLVM_SRC}/llvm/tools/clang/include/clang/StaticAnalyzer/Core/Checker.h", line = 28,
 FQN="clang::ento::check::ASTDecl", NM="_ZN5clang4ento5check7ASTDeclE",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.staticanalyzer/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/Checker.cpp -nm=_ZN5clang4ento5check7ASTDeclE")
//</editor-fold>
public class ASTDecl</*typename*/ DECL extends Decl> implements CheckBase { 
  /*template <typename CHECKER> TEMPLATE*/
  //<editor-fold defaultstate="collapsed" desc="clang::ento::check::ASTDecl::_checkDecl">
  @Converted(kind = Converted.Kind.MANUAL_SEMANTIC,
   source = "${LLVM_SRC}/llvm/tools/clang/include/clang/StaticAnalyzer/Core/Checker.h", line = 31,
   FQN="clang::ento::check::ASTDecl::_checkDecl", NM="Tpl__ZN5clang4ento5check7ASTDecl10_checkDeclEPvPKNS_4DeclERNS0_15AnalysisManagerERNS0_11BugReporterE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.staticanalyzer/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/Checker.cpp -nm=Tpl__ZN5clang4ento5check7ASTDecl10_checkDeclEPvPKNS_4DeclERNS0_15AnalysisManagerERNS0_11BugReporterE")
  //</editor-fold>
  private void _checkDecl(Class<DECL> cls, Object/*void P*/ checker, /*const*/ Decl /*P*/ D, final AnalysisManager /*&*/ mgr, 
            final BugReporter /*&*/ BR) {
    ((/*const*/ ASTDeclChecker /*P*/ )checker).checkASTDecl(cast(cls, D), mgr, BR);
  }

  
  //<editor-fold defaultstate="collapsed" desc="clang::ento::check::ASTDecl::_handlesDecl">
  @Converted(kind = Converted.Kind.MANUAL_SEMANTIC,
   source = "${LLVM_SRC}/llvm/tools/clang/include/clang/StaticAnalyzer/Core/Checker.h", line = 36,
   FQN="clang::ento::check::ASTDecl::_handlesDecl", NM="_ZN5clang4ento5check7ASTDecl12_handlesDeclEPKNS_4DeclE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.staticanalyzer/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/Checker.cpp -nm=_ZN5clang4ento5check7ASTDecl12_handlesDeclEPKNS_4DeclE")
  //</editor-fold>
  private boolean _handlesDecl(/*const*/ Decl /*P*/ D) {
    return isa(cls, D);
  }

/*public:*/
  /*template <typename CHECKER> TEMPLATE*/
  //<editor-fold defaultstate="collapsed" desc="clang::ento::check::ASTDecl::_register">
  @Converted(kind = Converted.Kind.MANUAL_SEMANTIC,
   source = "${LLVM_SRC}/llvm/tools/clang/include/clang/StaticAnalyzer/Core/Checker.h", line = 41,
   FQN="clang::ento::check::ASTDecl::_register", NM="Tpl__ZN5clang4ento5check7ASTDecl9_registerEPT_RNS0_14CheckerManagerE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.staticanalyzer/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/StaticAnalyzer/Core/Checker.cpp -nm=Tpl__ZN5clang4ento5check7ASTDecl9_registerEPT_RNS0_14CheckerManagerE")
  //</editor-fold>
  public void _register(CheckerBase /*P*/ checker, final CheckerManager /*&*/ mgr) {
    assert checker instanceof ASTDeclChecker : "forgot to add implement? " + checker.getClass();
    mgr._registerForDecl(
            new Check$CheckDeclFunc() {
              @Override
              public void $call(Object C, Decl d, AnalysisManager am, BugReporter br) {
                _checkDecl(cls, checker, d, am, br);
              }

              @Override
              public CheckerBase getChecker() {
                return checker;
              }
            },//(checker, _checkDecl<CHECKER>), 
            (Decl D) -> {
              return _handlesDecl(D);
            }
    ///*FuncRef*/ASTDecl::_handlesDecl
    );
  }

  private final Class<DECL> cls;

  public ASTDecl(Class<DECL> cls) {
    this.cls = cls;
  }
  
  @Override public String toString() {
    return ""; // NOI18N
  }
}