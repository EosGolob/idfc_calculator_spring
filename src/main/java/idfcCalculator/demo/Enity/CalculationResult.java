package idfcCalculator.demo.Enity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class CalculationResult {
    private int fixedEMIMonthlyIncNewEMI;
    private float foirPercent;
    private int assetAgeEot;
    private int ownerMultiplier;
    private int loanTenureValue;
    private int ownerShip;

    // Constructor, Getters and Setters
}