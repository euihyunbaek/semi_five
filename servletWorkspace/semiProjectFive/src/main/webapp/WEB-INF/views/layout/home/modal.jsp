<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <div class="modal">
        <div class="modal-body">
            <form id="modalForm" action="#" method="post" >
               
                <div class="region-wrap">

                    <label for="region"> 지역: </label>
                    input
                </div>
                    <div class="date-wrap">
                        <input type="date" id="checkInDate">
                        <span>~</span>
                        <input type="date" id="checkOutDate">                        
                    </div>

                <span id="dateError" class="error"></span>

                <!-- <label for="">
    
                    <option value=""></option>
                    <option value=""></option>
                </label> -->
                
                <div class="waterplay-yn">
                    <span>물놀이 가능 여부:</span>
                    <label>
                        <span><input type="radio" name ="waterplay" value="waterAll" checked>전체</span>
                    </label>
                    <label>
                        <span><input type="radio" name ="waterplay" value="waterYes">가능</span>
                    </label>
                    <label>
                        <span><input type="radio" name ="waterplay" value="waterNo">불가능</span>
                    </label>
                </div>
                <div class="dog-type-wrap">
                    <span>입장 허용 반려견 :</span>
                    <label>
                        <input type="radio" name="dogSize" value="all" checked> 전체
                    </label>
                    <label>
                        <input type="radio" name="dogSize" value="small"> 소형견 이하
                    </label>
                    <label>
                        <input type="radio" name="dogSize" value="medium"> 중형견 이하
                    </label>
                </div>
                <div class="price-wrap">
                    <span>1박당 가격: </span>
                    <input type="range" id="price-level" min="0" max="990000" value="1" step="10000"name="price-level"/>
                    <span id="price-value"></span><span>원 이하</span>
                </div>
                
                <button id="modalClose" type="button">확인</button>
              
                
            </form>

        </div>
    </div>
