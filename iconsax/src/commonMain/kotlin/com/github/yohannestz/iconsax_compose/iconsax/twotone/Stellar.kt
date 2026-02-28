package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Stellar: ImageVector
    get() {
        val current = _stellar
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Stellar",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.36f, y = 4.99f)
                arcTo(horizontalEllipseRadius = 8.0f, verticalEllipseRadius = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 3.75f)
                arcToRelative(a = 8.25f, b = 8.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -7.96f, dy1 = 10.44f)
                moveTo(x = 2.0f, y = 16.0f)
                lineTo(x = 22.0f, y = 5.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.62f, y = 18.99f)
                arcToRelative(a = 8.25f, b = 8.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 12.29f, dy1 = -9.35f)
                moveTo(x = 22.0f, y = 8.5f)
                lineToRelative(dx = -20.0f, dy = 11.0f)
            }
        }.build().also { _stellar = it }
    }

@Suppress("ObjectPropertyName")
private var _stellar: ImageVector? = null
