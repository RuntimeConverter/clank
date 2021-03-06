# Used directories
mkdir -p ${SPUTNIK}/modules/org.llvm.option/src/org/llvm/option
mkdir -p ${SPUTNIK}/modules/org.llvm.option/src/org/llvm/option/impl

# Global and static Enums
${SPUTNIK}/contrib/JConvert/jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.option/llvmToClangType ${LLVM_SRC}/llvm/lib/Option/Option.cpp "-nm=_ZN4llvm3opt10DriverFlagE;" > ${SPUTNIK}/modules/org.llvm.option/src/org/llvm/option/DriverFlag.java

# Global and static CXXRecords, ClassTemplates, ClassTemplateSpecializations
${SPUTNIK}/contrib/JConvert/jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.option/llvmToClangType ${LLVM_SRC}/llvm/lib/Option/Arg.cpp "-nm=_ZN4llvm3opt3ArgE;" > ${SPUTNIK}/modules/org.llvm.option/src/org/llvm/option/Arg.java
${SPUTNIK}/contrib/JConvert/jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.option/llvmToClangType ${LLVM_SRC}/llvm/lib/Option/ArgList.cpp "-nm=_ZN4llvm3opt7ArgListE;" > ${SPUTNIK}/modules/org.llvm.option/src/org/llvm/option/ArgList.java
${SPUTNIK}/contrib/JConvert/jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.option/llvmToClangType ${LLVM_SRC}/llvm/lib/Option/ArgList.cpp "-nm=_ZN4llvm3opt14DerivedArgListE;" > ${SPUTNIK}/modules/org.llvm.option/src/org/llvm/option/DerivedArgList.java
${SPUTNIK}/contrib/JConvert/jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.option/llvmToClangType ${LLVM_SRC}/llvm/lib/Option/ArgList.cpp "-nm=_ZN4llvm3opt12InputArgListE;" > ${SPUTNIK}/modules/org.llvm.option/src/org/llvm/option/InputArgList.java
${SPUTNIK}/contrib/JConvert/jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.option/llvmToClangType ${LLVM_SRC}/llvm/lib/Option/OptTable.cpp ${LLVM_SRC}/llvm/lib/Option/Option.cpp "-nm=_ZN4llvm3opt12OptSpecifierE;" > ${SPUTNIK}/modules/org.llvm.option/src/org/llvm/option/OptSpecifier.java
${SPUTNIK}/contrib/JConvert/jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.option/llvmToClangType ${LLVM_SRC}/llvm/lib/Option/OptTable.cpp "-nm=_ZN4llvm3opt8OptTableE;" > ${SPUTNIK}/modules/org.llvm.option/src/org/llvm/option/OptTable.java
${SPUTNIK}/contrib/JConvert/jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.option/llvmToClangType ${LLVM_SRC}/llvm/lib/Option/Option.cpp "-nm=_ZN4llvm3opt6OptionE;" > ${SPUTNIK}/modules/org.llvm.option/src/org/llvm/option/Option.java
${SPUTNIK}/contrib/JConvert/jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.option/llvmToClangType ${LLVM_SRC}/llvm/lib/Option/ArgList.cpp "-nm=_ZN4llvm3opt12arg_iteratorE;" > ${SPUTNIK}/modules/org.llvm.option/src/org/llvm/option/arg_iterator.java

# Global and static namespaces

# Static functions/variables
${SPUTNIK}/contrib/JConvert/jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.option/llvmToClangType ${LLVM_SRC}/llvm/lib/Option/OptTable.cpp "-nm=_ZL7isInputRKN4llvm9StringSetINS_15MallocAllocatorEEENS_9StringRefE;_ZL11matchOptionPKN4llvm3opt8OptTable4InfoENS_9StringRefEb;_ZL17getOptionHelpNameRKN4llvm3opt8OptTableENS0_12OptSpecifierE;_ZL19PrintHelpOptionListRN4llvm11raw_ostreamENS_9StringRefERSt6vectorISt4pairISsPKcESaIS7_EE;_ZL18getOptionHelpGroupRKN4llvm3opt8OptTableENS0_12OptSpecifierE;" -static-type=OptTableStatics -package=org.llvm.option.impl > ${SPUTNIK}/modules/org.llvm.option/src/org/llvm/option/impl/OptTableStatics.java

# Global functions/variables

# Global functions/variables for namespace as packages

# Static functions/variables for namespaces as packages
${SPUTNIK}/contrib/JConvert/jclank.sh -java-options=${SPUTNIK}/modules/org.llvm.option/llvmToClangType ${LLVM_SRC}/llvm/lib/Option/OptTable.cpp "-nm=_ZN4llvm3optL26StrCmpOptionNameIgnoreCaseEPKcS2_;_ZN4llvm3optL16StrCmpOptionNameEPKcS2_;_ZN4llvm3optltERKNS0_8OptTable4InfoES4_;_ZN4llvm3optltERKNS0_8OptTable4InfoEPKc;" -static-type=OptStatics -package=org.llvm.option.impl > ${SPUTNIK}/modules/org.llvm.option/src/org/llvm/option/impl/OptStatics.java

