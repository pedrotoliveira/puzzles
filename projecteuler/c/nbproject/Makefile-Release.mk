#
# Generated Makefile - do not edit!
#
# Edit the Makefile in the project folder instead (../Makefile). Each target
# has a -pre and a -post target defined where you can add customized code.
#
# This makefile implements configuration specific macros and targets.


# Environment
MKDIR=mkdir
CP=cp
GREP=grep
NM=nm
CCADMIN=CCadmin
RANLIB=ranlib
CC=gcc
CCC=g++
CXX=g++
FC=gfortran
AS=as

# Macros
CND_PLATFORM=GNU-Linux
CND_DLIB_EXT=so
CND_CONF=Release
CND_DISTDIR=dist
CND_BUILDDIR=build

# Include project Makefile
include Makefile

# Object Directory
OBJECTDIR=${CND_BUILDDIR}/${CND_CONF}/${CND_PLATFORM}

# Object Files
OBJECTFILES= \
	${OBJECTDIR}/projecteuler/main.o \
	${OBJECTDIR}/projecteuler/problem_1.o \
	${OBJECTDIR}/projecteuler/problem_2.o


# C Compiler Flags
CFLAGS=-m64 -Wall

# CC Compiler Flags
CCFLAGS=
CXXFLAGS=

# Fortran Compiler Flags
FFLAGS=

# Assembler Flags
ASFLAGS=

# Link Libraries and Options
LDLIBSOPTIONS=

# Build Targets
.build-conf: ${BUILD_SUBPROJECTS}
	"${MAKE}"  -f nbproject/Makefile-${CND_CONF}.mk ${CND_DISTDIR}/${CND_CONF}/${CND_PLATFORM}/${PROJECT_NAME}

${CND_DISTDIR}/${CND_CONF}/${CND_PLATFORM}/${PROJECT_NAME}: ${OBJECTFILES}
	${MKDIR} -p ${CND_DISTDIR}/${CND_CONF}/${CND_PLATFORM}
	${LINK.c} -o ${CND_DISTDIR}/${CND_CONF}/${CND_PLATFORM}/${PROJECT_NAME} ${OBJECTFILES} ${LDLIBSOPTIONS}

${OBJECTDIR}/projecteuler/main.o: projecteuler/main.c 
	${MKDIR} -p ${OBJECTDIR}/projecteuler
	${RM} "$@.d"
	$(COMPILE.c) -O2 -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/projecteuler/main.o projecteuler/main.c

${OBJECTDIR}/projecteuler/problem_1.o: projecteuler/problem_1.c 
	${MKDIR} -p ${OBJECTDIR}/projecteuler
	${RM} "$@.d"
	$(COMPILE.c) -O2 -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/projecteuler/problem_1.o projecteuler/problem_1.c

${OBJECTDIR}/projecteuler/problem_2.o: projecteuler/problem_2.c 
	${MKDIR} -p ${OBJECTDIR}/projecteuler
	${RM} "$@.d"
	$(COMPILE.c) -O2 -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/projecteuler/problem_2.o projecteuler/problem_2.c

# Subprojects
.build-subprojects:

# Clean Targets
.clean-conf: ${CLEAN_SUBPROJECTS}
	${RM} -r ${CND_BUILDDIR}/${CND_CONF}
	${RM} ${CND_DISTDIR}/${CND_CONF}/${CND_PLATFORM}/${PROJECT_NAME}

# Subprojects
.clean-subprojects:

# Enable dependency checking
.dep.inc: .depcheck-impl

include .dep.inc
