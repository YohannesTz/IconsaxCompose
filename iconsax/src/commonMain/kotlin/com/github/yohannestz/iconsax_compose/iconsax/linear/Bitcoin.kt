package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bitcoin: ImageVector
    get() {
        val current = _bitcoin
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Bitcoin",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.0f, y = 8.38f)
                horizontalLineToRelative(dx = 4.68f)
                arcToRelative(a = 1.94f, b = 1.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.88f, dy1 = 1.88f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.88f, dy1 = 1.88f)
                horizontalLineTo(x = 9.0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.0f, y = 12.13f)
                horizontalLineToRelative(dx = 5.35f)
                curveToRelative(dx1 = 1.2f, dy1 = 0.0f, dx2 = 2.15f, dy2 = 0.84f, dx3 = 2.15f, dy3 = 1.88f)
                reflectiveCurveToRelative(dx1 = -0.96f, dy1 = 1.88f, dx2 = -2.15f, dy2 = 1.88f)
                horizontalLineTo(x = 9.0f)
                close()
                moveToRelative(dx = 3.28f, dy = 3.75f)
                verticalLineToRelative(dy = 1.88f)
                moveToRelative(dx = -2.34f, dy = -1.88f)
                verticalLineToRelative(dy = 1.88f)
                moveTo(x = 12.28f, y = 6.5f)
                verticalLineToRelative(dy = 1.88f)
                moveTo(x = 9.94f, y = 6.5f)
                verticalLineToRelative(dy = 1.88f)
                moveToRelative(dx = 0.84f, dy = 0.0f)
                horizontalLineTo(x = 7.5f)
                moveToRelative(dx = 3.28f, dy = 7.5f)
                horizontalLineTo(x = 7.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
                close()
            }
        }.build().also { _bitcoin = it }
    }

@Suppress("ObjectPropertyName")
private var _bitcoin: ImageVector? = null
