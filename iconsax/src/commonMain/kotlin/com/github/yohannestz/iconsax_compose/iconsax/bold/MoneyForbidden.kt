package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MoneyForbidden: ImageVector
    get() {
        val current = _moneyForbidden
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MoneyForbidden",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 1.7f, y = 20.24f)
                lineToRelative(dx = 0.01f, dy = -0.02f)
                lineToRelative(dx = 5.5f, dy = -5.5f)
                lineToRelative(dx = 0.03f, dy = -0.02f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.66f, dy1 = 5.36f)
                close()
                moveToRelative(dx = 6.6f, dy = -4.49f)
                lineToRelative(dx = -0.02f, dy = 0.03f)
                lineToRelative(dx = -5.5f, dy = 5.5f)
                lineToRelative(dx = -0.03f, dy = 0.02f)
                arcToRelative(a = 3.97f, b = 3.97f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.67f, dy1 = -1.24f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.12f, dy1 = -4.31f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.0f, y = 4.0f)
                horizontalLineTo(x = 7.0f)
                curveTo(x1 = 4.0f, y1 = 4.0f, x2 = 2.0f, y2 = 5.5f, x3 = 2.0f, y3 = 9.0f)
                verticalLineToRelative(dy = 3.56f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.71f, dy1 = 0.45f)
                arcToRelative(a = 5.5f, b = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.3f, dy1 = -0.41f)
                arcToRelative(a = 5.56f, b = 5.56f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.31f, dy1 = 6.81f)
                curveToRelative(dx1 = -0.08f, dy1 = 0.31f, dx2 = 0.17f, dy2 = 0.6f, dx3 = 0.49f, dy3 = 0.6f)
                horizontalLineTo(x = 17.0f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 5.0f, dy2 = -1.5f, dx3 = 5.0f, dy3 = -5.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.5f, dx2 = -2.0f, dy2 = -5.0f, dx3 = -5.0f, dy3 = -5.0f)
                moveToRelative(dx = -5.0f, dy = 10.5f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -5.0f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 5.0f)
                moveToRelative(dx = 7.25f, dy = -0.5f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                close()
            }
        }.build().also { _moneyForbidden = it }
    }

@Suppress("ObjectPropertyName")
private var _moneyForbidden: ImageVector? = null
