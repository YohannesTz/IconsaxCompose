package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Speaker: ImageVector
    get() {
        val current = _speaker
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Speaker",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.0f, y = 22.75f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -3.42f, dy1 = 0.0f, dx2 = -4.75f, dy2 = -1.33f, dx3 = -4.75f, dy3 = -4.75f)
                verticalLineTo(y = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.42f, dx2 = 1.33f, dy2 = -4.75f, dx3 = 4.75f, dy3 = -4.75f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 3.42f, dy1 = 0.0f, dx2 = 4.75f, dy2 = 1.33f, dx3 = 4.75f, dy3 = 4.75f)
                verticalLineToRelative(dy = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.42f, dx2 = -1.33f, dy2 = 4.75f, dx3 = -4.75f, dy3 = 4.75f)
                moveToRelative(dx = -6.0f, dy = -20.0f)
                curveTo(x1 = 6.42f, y1 = 2.75f, x2 = 5.75f, y2 = 3.42f, x3 = 5.75f, y3 = 6.0f)
                verticalLineToRelative(dy = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.58f, dx2 = 0.67f, dy2 = 3.25f, dx3 = 3.25f, dy3 = 3.25f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 2.58f, dy1 = 0.0f, dx2 = 3.25f, dy2 = -0.67f, dx3 = 3.25f, dy3 = -3.25f)
                verticalLineTo(y = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.58f, dx2 = -0.67f, dy2 = -3.25f, dx3 = -3.25f, dy3 = -3.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 18.75f)
                arcToRelative(a = 3.75f, b = 3.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -7.5f)
                arcToRelative(a = 3.75f, b = 3.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 7.5f)
                moveToRelative(dx = 0.0f, dy = -6.0f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.5f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.5f)
                moveToRelative(dx = 0.0f, dy = -3.0f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -4.5f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 4.5f)
                moveToRelative(dx = 0.0f, dy = -3.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 11.59f, y1 = 8.25f, x2 = 12.0f, y2 = 8.25f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = -0.34f, dx2 = 0.75f, dy2 = -0.75f)
                reflectiveCurveTo(x1 = 12.41f, y1 = 6.75f, x2 = 12.0f, y2 = 6.75f)
            }
        }.build().also { _speaker = it }
    }

@Suppress("ObjectPropertyName")
private var _speaker: ImageVector? = null
