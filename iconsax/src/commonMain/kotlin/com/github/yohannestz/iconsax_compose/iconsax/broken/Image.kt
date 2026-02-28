package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Image: ImageVector
    get() {
        val current = _image
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Image",
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
                moveTo(x = 12.33f, y = 12.84f)
                curveToRelative(dx1 = -0.96f, dy1 = 1.73f, dx2 = -2.75f, dy2 = 1.88f, dx3 = -3.99f, dy3 = 0.33f)
                lineToRelative(dx = -0.22f, dy = -0.28f)
                curveToRelative(dx1 = -1.29f, dy1 = -1.62f, dx2 = -3.1f, dy2 = -1.42f, dx3 = -4.04f, dy3 = 0.43f)
                lineToRelative(dx = -1.72f, dy = 3.45f)
                arcTo(horizontalEllipseRadius = 3.62f, verticalEllipseRadius = 3.62f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 5.6f, y1 = 22.0f)
                horizontalLineToRelative(dx = 12.76f)
                arcToRelative(a = 3.62f, b = 3.62f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.32f, dy1 = -5.04f)
                lineToRelative(dx = -3.13f, dy = -7.31f)
                curveToRelative(dx1 = -1.06f, dy1 = -2.48f, dx2 = -3.0f, dy2 = -2.58f, dx3 = -4.32f, dy3 = -0.22f)
                moveTo(x = 9.97f, y = 5.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -2.0f, dy1 = -2.82f)
            }
        }.build().also { _image = it }
    }

@Suppress("ObjectPropertyName")
private var _image: ImageVector? = null
