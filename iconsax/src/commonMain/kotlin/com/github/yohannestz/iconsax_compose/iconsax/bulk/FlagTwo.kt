package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FlagTwo: ImageVector
    get() {
        val current = _flagTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FlagTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 6.45f, y = 22.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 2.75f)
                curveTo(x1 = 5.7f, y1 = 2.34f, x2 = 6.04f, y2 = 2.0f, x3 = 6.45f, y3 = 2.0f)
                reflectiveCurveTo(x1 = 7.2f, y1 = 2.34f, x2 = 7.2f, y2 = 2.75f)
                verticalLineToRelative(dy = 18.5f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.45f, y1 = 22.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 15.2f, y = 7.16f)
                lineToRelative(dx = -8.1f, dy = -3.5f)
                arcToRelative(a = 0.4f, b = 0.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.36f, dy1 = 0.03f)
                arcTo(horizontalEllipseRadius = 0.4f, verticalEllipseRadius = 0.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 6.58f, y1 = 4.0f)
                verticalLineToRelative(dy = 13.0f)
                arcToRelative(a = 0.4f, b = 0.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.18f, dy1 = 0.32f)
                arcToRelative(a = 0.4f, b = 0.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.2f, dy1 = 0.06f)
                arcToRelative(a = 0.4f, b = 0.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.17f, dy1 = -0.04f)
                lineToRelative(dx = 8.3f, dy = -4.1f)
                horizontalLineToRelative(dx = 0.01f)
                curveToRelative(dx1 = 1.66f, dy1 = -0.86f, dx2 = 2.55f, dy2 = -1.97f, dx3 = 2.5f, dy3 = -3.14f)
                curveToRelative(dx1 = -0.06f, dy1 = -1.18f, dx2 = -1.03f, dy2 = -2.22f, dx3 = -2.74f, dy3 = -2.94f)
            }
        }.build().also { _flagTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _flagTwo: ImageVector? = null
