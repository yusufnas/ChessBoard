/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgisleme;

import cezeri.matrix.CMatrix;

/**
 *
 * @author YUSUFNAS
 */

public class ChessBoard {

    public static void main(String[] args) {
        CMatrix cmKernel_left = CMatrix.getInstance()
                .numbers(50, 50, 255).cat(2, CMatrix.getInstance()
                        .numbers(50, 50, 0));

        CMatrix cmKernel_right = CMatrix.getInstance()
                .numbers(50, 50, 0).cat(2, CMatrix.getInstance()
                        .numbers(50, 50, 255))
                ;
        
        CMatrix cmKernel = cmKernel_left.cat(1,cmKernel_right).imshow();
        CMatrix cm_Row = cmKernel.replicateRow(4).replicateColumn(4).imshow();
    }

}
