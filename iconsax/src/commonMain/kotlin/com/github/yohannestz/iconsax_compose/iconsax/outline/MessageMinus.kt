package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessageMinus: ImageVector
    get() {
        val current = _messageMinus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MessageMinus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.0f, y = 22.75f)
                horizontalLineTo(x = 3.0f)
                arcTo(horizontalEllipseRadius = 1.76f, verticalEllipseRadius = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 1.25f, y1 = 21.0f)
                verticalLineTo(y = 8.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.42f, dx2 = 2.33f, dy2 = -6.75f, dx3 = 6.75f, dy3 = -6.75f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 4.42f, dy1 = 0.0f, dx2 = 6.75f, dy2 = 2.33f, dx3 = 6.75f, dy3 = 6.75f)
                verticalLineToRelative(dy = 8.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.42f, dx2 = -2.33f, dy2 = 6.75f, dx3 = -6.75f, dy3 = 6.75f)
                moveToRelative(dx = -8.0f, dy = -20.0f)
                curveTo(x1 = 4.42f, y1 = 2.75f, x2 = 2.75f, y2 = 4.42f, x3 = 2.75f, y3 = 8.0f)
                verticalLineToRelative(dy = 13.0f)
                arcTo(horizontalEllipseRadius = 0.25f, verticalEllipseRadius = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 3.0f, y1 = 21.25f)
                horizontalLineToRelative(dx = 13.0f)
                curveToRelative(dx1 = 3.58f, dy1 = 0.0f, dx2 = 5.25f, dy2 = -1.67f, dx3 = 5.25f, dy3 = -5.25f)
                verticalLineTo(y = 8.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.58f, dx2 = -1.67f, dy2 = -5.25f, dx3 = -5.25f, dy3 = -5.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.5f, y = 12.75f)
                horizontalLineToRelative(dx = -7.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 7.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _messageMinus = it }
    }

@Suppress("ObjectPropertyName")
private var _messageMinus: ImageVector? = null
