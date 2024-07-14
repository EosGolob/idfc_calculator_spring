package idfcCalculator.demo.serviceImpl;

import idfcCalculator.demo.Enity.CalculationInput;
import idfcCalculator.demo.Enity.CalculationResult;

public class CalculatorService {

    public static CalculationResult calculate(CalculationInput input) {
        int fixedEMIMonthlyIncNewEMI = input.getNewEMIWithIDFCOnProposedVehicle() + input.getOtherFixedEMIExcCurrentProposedCarLoanEMI();
        
        float foir = 0.0f;
        
        if (input.getSelectedEmploymentType().equals("Salaried")) {
            foir = fixedEMIMonthlyIncNewEMI / ((float) (input.getSalaryOrIncome() / 12));
        } else if (input.getSelectedEmploymentType().equals("Self Employed")) {
            foir = fixedEMIMonthlyIncNewEMI / ((float) (input.getSalaryOrIncome() / 12) * 2.5f);
        }
        
        float foirPercent = foir * 100;
        
        int assetAgeEot = (input.getCurrentYear() - input.getSelectedModelYear()) + input.getSelectedLoanTenure();
        
        int ownerMultiplier = (input.getSelectOwner() >= 1 && 
                              (input.getFinalTiercom().equals("Plat") || input.getFinalTiercom().equals("Gold"))) ? 150 : 120;
        
        if (input.getSelectOwner() < 1) {
            ownerMultiplier = 200;
        }
        
        int loanTenureValue = (input.getCurrentloanTenure() > 9) ? 0 : 200;
        
        int ownerShip;
        if(input.getSelectOwner() > 1) {
        	
          ownerShip = 120;
        }else {
          ownerShip = 200;
        }

        return new CalculationResult(fixedEMIMonthlyIncNewEMI, foirPercent, assetAgeEot, ownerMultiplier, loanTenureValue ,ownerShip);
    }
}
