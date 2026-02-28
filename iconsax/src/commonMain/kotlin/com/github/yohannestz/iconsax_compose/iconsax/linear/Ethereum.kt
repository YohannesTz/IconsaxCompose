package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Ethereum: ImageVector
    get() {
        val current = _ethereum
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Ethereum",
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
                moveTo(x = 10.45f, y = 3.05f)
                lineTo(x = 6.71f, y = 7.71f)
                curveToRelative(dx1 = -0.85f, dy1 = 1.06f, dx2 = -0.55f, dy2 = 2.42f, dx3 = 0.66f, dy3 = 3.02f)
                lineToRelative(dx = 3.73f, dy = 1.87f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.78f, dy1 = 0.0f)
                lineToRelative(dx = 3.73f, dy = -1.87f)
                curveToRelative(dx1 = 1.21f, dy1 = -0.61f, dx2 = 1.51f, dy2 = -1.97f, dx3 = 0.66f, dy3 = -3.02f)
                lineToRelative(dx = -3.73f, dy = -4.66f)
                curveToRelative(dx1 = -0.84f, dy1 = -1.07f, dx2 = -2.24f, dy2 = -1.07f, dx3 = -3.09f, dy3 = 0.0f)
                moveTo(x = 12.0f, y = 2.3f)
                verticalLineToRelative(dy = 5.26f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.8f, y = 10.71f)
                lineTo(x = 12.0f, y = 7.56f)
                lineToRelative(dx = 4.2f, dy = 3.15f)
                moveToRelative(dx = -7.43f, dy = 3.72f)
                lineToRelative(dx = 1.61f, dy = 0.72f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.25f, dy1 = 0.0f)
                lineToRelative(dx = 1.61f, dy = -0.72f)
                curveToRelative(dx1 = 1.44f, dy1 = -0.64f, dx2 = 2.77f, dy2 = 1.1f, dx3 = 1.77f, dy3 = 2.32f)
                lineToRelative(dx = -3.46f, dy = 4.23f)
                curveToRelative(dx1 = -0.85f, dy1 = 1.04f, dx2 = -2.24f, dy2 = 1.04f, dx3 = -3.1f, dy3 = 0.0f)
                lineTo(x = 7.0f, y = 16.75f)
                curveToRelative(dx1 = -1.01f, dy1 = -1.22f, dx2 = 0.32f, dy2 = -2.96f, dx3 = 1.77f, dy3 = -2.32f)
            }
        }.build().also { _ethereum = it }
    }

@Suppress("ObjectPropertyName")
private var _ethereum: ImageVector? = null
