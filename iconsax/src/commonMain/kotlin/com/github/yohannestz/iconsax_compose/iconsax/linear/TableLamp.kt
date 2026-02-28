package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TableLamp: ImageVector
    get() {
        val current = _tableLamp
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TableLamp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 5.79f, y = 14.69f)
                horizontalLineToRelative(dx = 12.42f)
                curveToRelative(dx1 = 1.66f, dy1 = 0.0f, dx2 = 2.66f, dy2 = -1.31f, dx3 = 2.23f, dy3 = -2.91f)
                lineToRelative(dx = -2.2f, dy = -8.07f)
                arcTo(horizontalEllipseRadius = 2.5f, verticalEllipseRadius = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.01f, y1 = 2.0f)
                horizontalLineTo(x = 7.99f)
                arcToRelative(a = 2.45f, b = 2.45f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.22f, dy1 = 1.7f)
                lineToRelative(dx = -2.2f, dy = 8.07f)
                curveToRelative(dx1 = -0.44f, dy1 = 1.61f, dx2 = 0.56f, dy2 = 2.92f, dx3 = 2.22f, dy3 = 2.92f)
                moveTo(x = 12.0f, y = 15.0f)
                verticalLineToRelative(dy = 7.0f)
                moveToRelative(dx = -4.0f, dy = 0.0f)
                horizontalLineToRelative(dx = 8.0f)
            }
        }.build().also { _tableLamp = it }
    }

@Suppress("ObjectPropertyName")
private var _tableLamp: ImageVector? = null
