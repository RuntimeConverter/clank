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

package org.clang.frontend;

import org.clank.java.*;
import org.clank.support.*;
import static org.clank.support.NativePointer.*;
import org.llvm.support.*;
import org.llvm.adt.*;
import org.llvm.adt.aliases.*;
import org.clang.ast.*;
import org.clang.basic.*;
import org.clang.serialization.*;
import org.clang.frontend.*;

//<editor-fold defaultstate="collapsed" desc="clang::VerifyPCHAction">
@Converted(kind = Converted.Kind.AUTO,
 source = "${LLVM_SRC}/llvm/tools/clang/include/clang/Frontend/FrontendActions.h", line = 150,
 FQN="clang::VerifyPCHAction", NM="_ZN5clang15VerifyPCHActionE",
 cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.frontend/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/FrontendTool/ExecuteCompilerInvocation.cpp -nm=_ZN5clang15VerifyPCHActionE")
//</editor-fold>
public class VerifyPCHAction extends /*public*/ ASTFrontendAction implements Destructors.ClassWithDestructor {
/*protected:*/
  //<editor-fold defaultstate="collapsed" desc="clang::VerifyPCHAction::CreateASTConsumer">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/lib/Frontend/FrontendActions.cpp", line = 427,
   old_source = "${LLVM_SRC}/llvm/tools/clang/lib/Frontend/FrontendActions.cpp", old_line = 422,
   FQN="clang::VerifyPCHAction::CreateASTConsumer", NM="_ZN5clang15VerifyPCHAction17CreateASTConsumerERNS_16CompilerInstanceEN4llvm9StringRefE",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.frontend/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Frontend/FrontendActions.cpp -nm=_ZN5clang15VerifyPCHAction17CreateASTConsumerERNS_16CompilerInstanceEN4llvm9StringRefE")
  //</editor-fold>
  @Override protected std.unique_ptr<ASTConsumer> CreateASTConsumer(CompilerInstance /*&*/ CI, StringRef InFile)/* override*/ {
    return llvm.make_unique(new ASTConsumer());
  }


  //<editor-fold defaultstate="collapsed" desc="clang::VerifyPCHAction::ExecuteAction">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/lib/Frontend/FrontendActions.cpp", line = 432,
   old_source = "${LLVM_SRC}/llvm/tools/clang/lib/Frontend/FrontendActions.cpp", old_line = 427,
   FQN="clang::VerifyPCHAction::ExecuteAction", NM="_ZN5clang15VerifyPCHAction13ExecuteActionEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.frontend/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/Frontend/FrontendActions.cpp -nm=_ZN5clang15VerifyPCHAction13ExecuteActionEv")
  //</editor-fold>
  @Override protected void ExecuteAction()/* override*/ {
    std.unique_ptr<ASTReader> Reader = null;
    try {
      CompilerInstance /*&*/ CI = getCompilerInstance();
      boolean Preamble = CI.getPreprocessorOpts().PrecompiledPreambleBytes.first != 0;
      /*const*/std.string/*&*/ Sysroot = CI.getHeaderSearchOpts().Sysroot;
      Reader/*J*/= new std.unique_ptr<ASTReader>(new ASTReader(CI.getPreprocessor(), CI.getASTContext(), CI.getPCHContainerReader(), 
              new ArrayRef<IntrusiveRefCntPtr<ModuleFileExtension> >(CI.getFrontendOpts().ModuleFileExtensions), 
              new StringRef(Sysroot.empty() ? $EMPTY : Sysroot.c_str()), 
              /*DisableValidation*/ false, 
              /*AllowPCHWithCompilerErrors*/ false, 
              /*AllowConfigurationMismatch*/ true, 
              /*ValidateSystemInputs*/ true));
      
      Reader.$arrow().ReadAST(getCurrentFile(), 
          Preamble ? ModuleKind.MK_Preamble : ModuleKind.MK_PCH, 
          new SourceLocation(), 
          ASTReader.LoadFailureCapabilities.ARR_ConfigurationMismatch);
    } finally {
      if (Reader != null) { Reader.$destroy(); }
    }
  }


/*public:*/
  //<editor-fold defaultstate="collapsed" desc="clang::VerifyPCHAction::hasCodeCompletionSupport">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/include/clang/Frontend/FrontendActions.h", line = 158,
   FQN="clang::VerifyPCHAction::hasCodeCompletionSupport", NM="_ZNK5clang15VerifyPCHAction24hasCodeCompletionSupportEv",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.frontend/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/FrontendTool/ExecuteCompilerInvocation.cpp -nm=_ZNK5clang15VerifyPCHAction24hasCodeCompletionSupportEv")
  //</editor-fold>
  @Override public boolean hasCodeCompletionSupport() /*const*//* override*/ {
    return false;
  }

  //<editor-fold defaultstate="collapsed" desc="clang::VerifyPCHAction::~VerifyPCHAction">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/include/clang/Frontend/FrontendActions.h", line = 150,
   FQN="clang::VerifyPCHAction::~VerifyPCHAction", NM="_ZN5clang15VerifyPCHActionD0Ev",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.frontend/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/FrontendTool/ExecuteCompilerInvocation.cpp -nm=_ZN5clang15VerifyPCHActionD0Ev")
  //</editor-fold>
  @Override public /*inline*/ void $destroy() {
    super.$destroy();
  }

  //<editor-fold defaultstate="collapsed" desc="clang::VerifyPCHAction::VerifyPCHAction">
  @Converted(kind = Converted.Kind.AUTO,
   source = "${LLVM_SRC}/llvm/tools/clang/include/clang/Frontend/FrontendActions.h", line = 150,
   FQN="clang::VerifyPCHAction::VerifyPCHAction", NM="_ZN5clang15VerifyPCHActionC1Ev",
   cmd="jclank.sh -java-options=${SPUTNIK}/modules/org.clang.frontend/llvmToClangType ${LLVM_SRC}/llvm/tools/clang/lib/FrontendTool/ExecuteCompilerInvocation.cpp -nm=_ZN5clang15VerifyPCHActionC1Ev")
  //</editor-fold>
  public /*inline*/ VerifyPCHAction() {
    // : ASTFrontendAction() 
    //START JInit
    super();
    //END JInit
  }

  
  @Override public String toString() {
    return "" + super.toString(); // NOI18N
  }
}
