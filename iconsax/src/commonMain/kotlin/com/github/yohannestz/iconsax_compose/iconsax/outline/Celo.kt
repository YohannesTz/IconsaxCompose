package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Celo: ImageVector
    get() {
        val current = _celo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Celo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 15.0f, y = 16.75f)
                curveToRelative(dx1 = -4.27f, dy1 = 0.0f, dx2 = -7.75f, dy2 = -3.48f, dx3 = -7.75f, dy3 = -7.75f)
                reflectiveCurveTo(x1 = 10.73f, y1 = 1.25f, x2 = 15.0f, y2 = 1.25f)
                reflectiveCurveTo(x1 = 22.75f, y1 = 4.73f, x2 = 22.75f, y2 = 9.0f)
                reflectiveCurveToRelative(dx1 = -3.48f, dy1 = 7.75f, dx2 = -7.75f, dy2 = 7.75f)
                moveToRelative(dx = 0.0f, dy = -14.0f)
                arcToRelative(a = 6.25f, b = 6.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 12.5f)
                arcToRelative(a = 6.25f, b = 6.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -12.5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 9.0f, y = 22.75f)
                curveToRelative(dx1 = -4.27f, dy1 = 0.0f, dx2 = -7.75f, dy2 = -3.48f, dx3 = -7.75f, dy3 = -7.75f)
                reflectiveCurveTo(x1 = 4.73f, y1 = 7.25f, x2 = 9.0f, y2 = 7.25f)
                reflectiveCurveToRelative(dx1 = 7.75f, dy1 = 3.48f, dx2 = 7.75f, dy2 = 7.75f)
                reflectiveCurveToRelative(dx1 = -3.48f, dy1 = 7.75f, dx2 = -7.75f, dy2 = 7.75f)
                moveToRelative(dx = 0.0f, dy = -14.0f)
                arcToRelative(a = 6.25f, b = 6.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 12.5f)
                arcToRelative(a = 6.25f, b = 6.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -12.5f)
            }
        }.build().also { _celo = it }
    }

@Suppress("ObjectPropertyName")
private var _celo: ImageVector? = null
