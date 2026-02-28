package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MoneySend: ImageVector
    get() {
        val current = _moneySend
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MoneySend",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.5f, y = 13.75f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.67f, dy1 = 1.75f)
                horizontalLineToRelative(dx = 1.88f)
                curveToRelative(dx1 = 0.8f, dy1 = 0.0f, dx2 = 1.45f, dy2 = -0.68f, dx3 = 1.45f, dy3 = -1.53f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.91f, dx2 = -0.4f, dy2 = -1.24f, dx3 = -0.99f, dy3 = -1.45f)
                lineToRelative(dx = -3.01f, dy = -1.05f)
                curveToRelative(dx1 = -0.59f, dy1 = -0.21f, dx2 = -0.99f, dy2 = -0.53f, dx3 = -0.99f, dy3 = -1.45f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.45f, dy1 = -1.53f)
                horizontalLineToRelative(dx = 1.88f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.67f, dy1 = 1.75f)
                moveTo(x = 12.0f, y = 7.5f)
                verticalLineToRelative(dy = 9.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 12.0f)
                arcTo(horizontalEllipseRadius = 10.0f, verticalEllipseRadius = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, x1 = 12.0f, y1 = 2.0f)
                moveToRelative(dx = 10.0f, dy = 4.0f)
                verticalLineTo(y = 2.0f)
                horizontalLineToRelative(dx = -4.0f)
                moveToRelative(dx = -1.0f, dy = 5.0f)
                lineToRelative(dx = 5.0f, dy = -5.0f)
            }
        }.build().also { _moneySend = it }
    }

@Suppress("ObjectPropertyName")
private var _moneySend: ImageVector? = null
