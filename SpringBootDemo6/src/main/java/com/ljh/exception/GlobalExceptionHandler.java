package com.ljh.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ljh.entity.ErrorInfo;

/**
 * 创建全局异常处理类
 *
 * @author L.J.H
 * @version 1.0
 * @created 2018年02月25日 16:14:26
 * @Remark 通过@ControllerAdvice定义统一的异常处理类，而不是在每个Controller中逐个定义
 * @ExceptionHandler 用来定义不同函数针对的不同异常类型
 * 
 */
@ControllerAdvice
class GlobalExceptionHandler {

	public static final String DEFAUL_ERROR_VIEW = "error";

	@ExceptionHandler(value = Exception.class)
	public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", e);
		mav.addObject("url", req.getRequestURL());
		mav.setViewName(DEFAUL_ERROR_VIEW);
		return mav;
	}

	@ExceptionHandler(value = MyException.class)
	@ResponseBody
	public ErrorInfo<String> jsonErrorHandler(HttpServletRequest req, MyException e) {
		ErrorInfo<String> r = new ErrorInfo<>();
		r.setMessage(e.getMessage());
		r.setCode(ErrorInfo.ERROR);
		r.setData("Some Data");
		r.setUrl(req.getRequestURL().toString());
		return r;
	}
}
