package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChemicalGlass: ImageVector
    get() {
        val current = _chemicalGlass
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ChemicalGlass",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.84f, y = 22.0f)
                horizontalLineTo(x = 8.16f)
                curveToRelative(dx1 = -4.19f, dy1 = 0.0f, dx2 = -5.02f, dy2 = -2.53f, dx3 = -3.66f, dy3 = -5.61f)
                lineToRelative(dx = 1.44f, dy = -3.27f)
                reflectiveCurveTo(x1 = 9.0f, y1 = 13.0f, x2 = 12.0f, y2 = 14.0f)
                reflectiveCurveToRelative(dx1 = 5.83f, dy1 = -0.9f, dx2 = 5.83f, dy2 = -0.9f)
                lineTo(x = 18.02f, y = 13.0f)
                lineToRelative(dx = 1.49f, dy = 3.4f)
                curveToRelative(dx1 = 1.34f, dy1 = 3.09f, dx2 = 0.46f, dy2 = 5.6f, dx3 = -3.67f, dy3 = 5.6f)
                moveToRelative(dx = -0.4f, dy = -15.26f)
                horizontalLineToRelative(dx = -0.16f)
                lineToRelative(dx = 2.13f, dy = 4.86f)
                lineTo(x = 17.0f, y = 11.86f)
                curveToRelative(dx1 = -0.02f, dy1 = 0.01f, dx2 = -2.28f, dy2 = 1.46f, dx3 = -4.53f, dy3 = 0.72f)
                arcToRelative(a = 20.0f, b = 20.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.87f, dy1 = -0.95f)
                lineToRelative(dx = 2.14f, dy = -4.89f)
                horizontalLineToRelative(dx = -0.3f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.68f, dy1 = -0.69f)
                arcTo(horizontalEllipseRadius = 2.38f, verticalEllipseRadius = 2.38f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.44f, y1 = 2.0f)
                horizontalLineToRelative(dx = 7.11f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.68f, dy1 = 0.7f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.63f, dy1 = 2.25f)
                arcToRelative(a = 2.45f, b = 2.45f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.42f, dy1 = 1.79f)
            }
        }.build().also { _chemicalGlass = it }
    }

@Suppress("ObjectPropertyName")
private var _chemicalGlass: ImageVector? = null
