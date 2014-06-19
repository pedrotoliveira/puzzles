/* 
 * File:   header.h
 * Author: Pedro T. Oliveira
 *
 * Created on September 24, 2012, 3:24 AM
 */
#ifndef HEADER_H
#define HEADER_H
#define TRUE 1
#define FALSE 0
#define DEBUG_ACTIVE TRUE
#define SEPARATOR_LINE "=========================="

#ifdef	__cplusplus
extern "C" {
#endif

#ifdef	__cplusplus
}
#endif
#endif	/* HEADER_H */
	
#define debug(msg)  if(DEBUG_ACTIVE) { printf("Debug [%s] [%d] [%s ] \n", __FILE__, __LINE__, msg); }