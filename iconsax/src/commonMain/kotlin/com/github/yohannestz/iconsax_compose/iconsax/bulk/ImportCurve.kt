package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ImportCurve: ImageVector
    get() {
        val current = _importCurve
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ImportCurve",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 16.8f, y = 9.0f)
                horizontalLineTo(x = 7.2f)
                curveTo(x1 = 4.0f, y1 = 9.0f, x2 = 2.0f, y2 = 11.0f, x3 = 2.0f, y3 = 14.2f)
                verticalLineToRelative(dy = 2.59f)
                curveTo(x1 = 2.0f, y1 = 20.0f, x2 = 4.0f, y2 = 22.0f, x3 = 7.2f, y3 = 22.0f)
                horizontalLineToRelative(dx = 9.59f)
                curveToRelative(dx1 = 3.2f, dy1 = 0.0f, dx2 = 5.2f, dy2 = -2.0f, dx3 = 5.2f, dy3 = -5.2f)
                verticalLineToRelative(dy = -2.6f)
                curveTo(x1 = 22.0f, y1 = 11.0f, x2 = 20.0f, y2 = 9.0f, x3 = 16.8f, y3 = 9.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.88f, y = 12.43f)
                lineToRelative(dx = -3.35f, dy = 3.35f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.06f, dy1 = 0.0f)
                lineToRelative(dx = -3.35f, dy = -3.35f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                lineToRelative(dx = 2.07f, dy = 2.07f)
                verticalLineTo(y = 2.75f)
                curveTo(x1 = 11.25f, y1 = 2.34f, x2 = 11.59f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 10.69f)
                lineToRelative(dx = 2.07f, dy = -2.07f)
                quadToRelative(dx1 = 0.24f, dy1 = -0.22f, dx2 = 0.53f, dy2 = -0.22f)
                curveToRelative(dx1 = 0.29f, dy1 = 0.0f, dx2 = 0.38f, dy2 = 0.07f, dx3 = 0.53f, dy3 = 0.22f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
            }
        }.build().also { _importCurve = it }
    }

@Suppress("ObjectPropertyName")
private var _importCurve: ImageVector? = null
